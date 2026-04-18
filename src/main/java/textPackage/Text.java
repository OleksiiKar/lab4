package textPackage;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Represents the full text, decomposed into sentences and terminating punctuation.
 */
public class Text {
    /** List of text components (Sentence or Punctuation). */
    @Getter
    private final List<textElements> splitText = new ArrayList<>();

    /**
     * Constructor that splits the input text into sentences based on delimiters.
     *
     * @param texts the full input text.
     */
    public Text(@NonNull String texts){
        // Group 1: Any sequence that isn't a sentence terminator
        // Group 2: Sentence terminators (. ! ?)
        String regex = "([^.!?]+)|([.!?]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texts);
        while (matcher.find()){
            String element = matcher.group();
            if(matcher.group(1)!=null){
                splitText.add(new Sentence(element));
            }
            else if(matcher.group(2)!=null){
                splitText.add(new Punctuation(element));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(textElements i:splitText){
            sb.append(i.toString());
        }
        return sb.toString();
    }
}