package heroes;

import place.*;
import java.util.Objects;

public class Rabbit extends Hero {
    private final static String name = "Кролик";
    public Rabbit(Place location){
        super(name, location);
    }

    @Override
    public java.lang.String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o){
        if((name != o.toString())||(o == null)) return false;
        else return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}