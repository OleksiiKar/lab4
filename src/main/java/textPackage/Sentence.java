package textPackage;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence implements Comparable<Sentence>, textElements{
    @Getter
    private final List<textElements> splitSentence = new ArrayList<>();

    public Sentence(@NonNull String sentences){
        String regex = "([a-zA-Zа-яА-ЯіІїЇєЄґҐ0-9-]+)|([\\s,:—]+)";
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
    private String getFirstWord(){
        for (textElements el:splitSentence){
            if (el instanceof Word){
                return el.toString();
            }
        }
        return "";
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(textElements i:splitSentence){
            sb.append(i.toString());
        }
        return sb.toString();
    }
    @Override
    public int compareTo(@NonNull Sentence other) {
        return this.getFirstWord().compareTo(other.getFirstWord());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return java.util.Objects.equals(splitSentence, sentence.splitSentence);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(splitSentence);
    }
}
