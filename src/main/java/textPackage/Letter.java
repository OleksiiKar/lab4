package textPackage;

import lombok.Getter;

public class Letter {
    @Getter
    private char chars;
    public Letter(char chars){
        this.chars = chars;
    }

    @Override
    public String toString(){
        return String.valueOf(chars);
    }
}
