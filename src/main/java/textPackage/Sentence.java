package textPackage;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Represents a sentence as a list of elements (words and punctuation).
 */
public class Sentence implements Comparable<Sentence>, textElements{
    /** List of sentence elements (Word or Punctuation). */
    @Getter
    private final List<textElements> splitSentence = new ArrayList<>();

    /**
     * Constructor using regular expressions to split a sentence into words and marks.
     *
     * @param sentences the input sentence string.
     */
    public Sentence(@NonNull String sentences){
        // Group 1: Words (includes hyphens and Cyrillic/Latin characters)
        // Group 2: Internal punctuation (spaces, commas, dashes, etc.)
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
    /**
     * Helper method to retrieve the first word of the sentence for comparison.
     *
     * @return the first Word found as a string, or an empty string if none.
     */
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
    /**
     * Compares sentences based on their first word for sorting.
     */
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
