package textPackage;


import lombok.Getter;
import lombok.Setter;

public class Punctuation {
    @Getter @Setter
    private char myPunctuation;

    public Punctuation(char myPunctuation){
        this.myPunctuation = myPunctuation;
    }

    @Override
    public String toString() {
        return String.valueOf(myPunctuation);
    }
}
