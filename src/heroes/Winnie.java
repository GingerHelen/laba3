package heroes;

import place.*;
import heroesSkills.WinnieSkills;

import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Winnie extends Hero implements WinnieSkills {
    private final static String name = "Винни-Пух";
    public Winnie(Place location){
        super(name, location);
    }
    public String winnieAdvent() {
        return "Тут появляется " + name;
    }

    @Override
    public boolean equals(Object o){
        if((name != o.toString())||(o == null)) return false;
        else return true;
    }

    @Override
    public java.lang.String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String winnieRun(Place location) {
        return name + " бежит к " + location.toString();
    }

}