package heroes;
import place.*;

import java.util.Objects;

public abstract class Hero {
    public String name;
    private Place location;
    public Hero(String name, Place location) {
        this.name = name;
        this.location = location;
    }
    public void setLocation(Place location) {
        if (this.location != location) this.location = location;
        else System.out.println("Ошибка!" + name + " уже " + location.toString());
    }

    public String farewell(Hero hero) {
        return "Прощание: " + name + " и " + hero.toString();
    }
}
