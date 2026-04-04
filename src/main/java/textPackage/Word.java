package textPackage;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word implements Comparable<Word>, textElements{
    @Getter
    private final List<Letter> letters = new ArrayList<>();

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

    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null || getClass()!=obj.getClass()) return false;
        Word other = (Word) obj;
        return Objects.equals(this.letters, other.letters);
    }
}