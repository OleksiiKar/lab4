package textPackage;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a word consisting of a sequence of letters.
 * Implements TextElement and Comparable for alphabetical sorting.
 */
public class Word implements Comparable<Word>, textElements {
    /** List of Letter objects forming the word. */
    @Getter
    private final List<Letter> letters = new ArrayList<>();

    /**
     * Constructor that decomposes a string into Letter objects.
     *
     * @param word the string representing the word.
     * @throws NullPointerException if the input string is null.
     */
    public Word(@NonNull String word){
        for(char i:word.toCharArray()){
            this.letters.add(new Letter(i));
        }
    }

    /**
     * Returns the full word as a string.
     *
     * @return reconstructed string from letters.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Letter l:letters){
            sb.append(l);
        }
        return sb.toString();
    }

    /**
     * Compares this word with another for sorting purposes.
     *
     * @param o the word to compare to.
     * @return negative, zero, or positive integer based on lexicographical order.
     */
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
    @Override
    public int hashCode() {
        return Objects.hash(letters);
    }
}