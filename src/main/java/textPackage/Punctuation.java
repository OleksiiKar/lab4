package textPackage;

import lombok.Getter;

/**
 * Represents punctuation marks or whitespace characters within the text.
 */
public class Punctuation implements textElements{

    /** String containing the punctuation mark(s). */
    @Getter
    private final String punctuation;

    /**
     * Constructs a Punctuation object.
     *
     * @param punctuation character(s) representing punctuation.
     */
    public Punctuation(String punctuation) {
        this.punctuation = punctuation;
    }

    @Override
    public String toString() {
        return punctuation;
    }
}
