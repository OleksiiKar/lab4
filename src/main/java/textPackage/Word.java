package textPackage;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Word implements Comparable<Word>{
    private List<Letter> letters = new ArrayList<>();

    public Word(@NonNull String word){
        for(char i:word.toCharArray()){
            this.letters.add(new Letter(i));
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Letter l:letters){
            sb.append(l);
        }
        return sb.toString();
    }

    @Override
    public int compareTo(@NonNull Word o) {
        return this.toString().compareTo(o.toString());
    }
}