package heroes;

import place.*;
import heroesSkills.PigletSkills;
import chamomile.*;
import java.util.Objects;


public class Piglet extends Hero implements PigletSkills {
    private final static String name = "Пятачок";

    public Piglet(Place location) {
        super(name, location);
    }

    public String pigletHopes(Hero hero) {
        return name + " надеется, что не " + hero.toString();
    }

    public String pigletForget() {
        return name + " забыл, кто загадан ";
    }

    public void pigletActivity(Place location, String activity) {
        if (activity == "сидит") {
            System.out.println(name + " сидит " + location.toString());
        } else System.out.println(name + " не сидит, а делает что-то другое :)");
    }

    public String pigletWonders() {
        return name + " гадает на ромашке";
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
