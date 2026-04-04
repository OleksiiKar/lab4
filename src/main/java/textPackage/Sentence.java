package textPackage;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    @Getter
    private final List<Word> words = new ArrayList<>();

    public Sentence(@NonNull String sentences){
        String[] splitWords = sentences.split("[\\s,.!?]+");
        for (String i:splitWords){
            words.add(new Word(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Word i:words){
            sb.append(i.toString());
        }
        return sb.toString();
    }
}
