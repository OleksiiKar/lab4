package textPackage;

import lombok.Getter;

public class Punctuation implements textElements{
    @Getter
    private final String punctuation;

    public Punctuation(String punctuation){
        this.punctuation = punctuation;
    }

    @Override
    public String toString() {
        return punctuation;
    }
}
