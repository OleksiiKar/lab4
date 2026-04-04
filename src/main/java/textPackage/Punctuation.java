package textPackage;

import lombok.Getter;

public class Punctuation {
    @Getter
    private char punctuation;

    public Punctuation(char punctuation){
        this.punctuation = punctuation;
    }

    @Override
    public String toString() {
        return String.valueOf(punctuation);
    }
}
