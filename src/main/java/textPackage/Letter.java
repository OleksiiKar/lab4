package textPackage;

import java.util.Objects;
import lombok.Getter;

/**
 * Represents a single character (letter).
 * Used as a fundamental building block for a Word.
 */
public class Letter {

    /** The character value stored in this object. */
    @Getter
    private final char chars;

    /**
     * Constructs a new Letter object.
     *
     * @param chars the character value.
     */
    public Letter(char chars) {
        this.chars = chars;
    }

    /**
     * Returns the string representation of the letter.
     *
     * @return character as a String.
     */
    @Override
    public String toString() {
        return String.valueOf(chars);
    }

    /**
     * Compares this letter with another object for equality.
     *
     * @param obj the object to compare with.
     * @return true if the objects are identical or have the same character value.
     */
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null || getClass()!=obj.getClass()) return false;
        Letter other = (Letter) obj;
        return this.chars==other.chars;
    }

    /**
     * Generates a hash code for the letter.
     *
     * @return integer hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(chars);
    }
}
