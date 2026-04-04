package textPackage;

import lombok.Getter;

import java.util.Objects;

public class Letter {
    @Getter
    private final char chars;
    public Letter(char chars){
        this.chars = chars;
    }

    @Override
    public String toString(){
        return String.valueOf(chars);
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null || getClass()!=obj.getClass()) return false;
        Letter other = (Letter) obj;
        return this.chars==other.chars;
    }
}
