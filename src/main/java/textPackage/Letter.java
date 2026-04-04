package textPackage;

import lombok.Getter;
import lombok.Setter;

public class Letter {
    @Getter @Setter
    private char myChar;
    public Letter(char chars){
        this.myChar = chars;
    }

    @Override
    public String toString(){
        return String.valueOf(myChar);
    }
}
