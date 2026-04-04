package textPackage;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    @Getter
    private final List<textElements> splitText = new ArrayList<>();

    public Text(@NonNull String texts){
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