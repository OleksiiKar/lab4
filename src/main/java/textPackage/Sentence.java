package textPackage;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    @Getter
    private final List<textElements> splitSentence = new ArrayList<>();

    public Sentence(@NonNull String sentences){
        String regex = "([a-zA-Zа-яА-ЯіІїЇєЄґҐ]+)|([\\s,:-]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentences);
        while (matcher.find()){
            String element = matcher.group();
            if(matcher.group(1)!=null){
                splitSentence.add(new Word(element));
            }
            else if(matcher.group(2)!=null){
                splitSentence.add(new Punctuation(element));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(textElements i:splitSentence){
            sb.append(i.toString());
        }
        return sb.toString();
    }
}
