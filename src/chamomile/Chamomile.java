package chamomile;

import place.Place;

import java.util.Objects;

public class Chamomile implements FortuneTellingOnChamomile {
    private final static String name = "ромашка";
    public void resultOfChamomile(PossibleOutcomesOfChamomile result) {
        if (result.toString() == "плюнет") {
            System.out.println("Оказалось, что " + result + " (грустно)");
        }
        else if (result.toString() == "не любит") {
            System.out.println("Оказалось, что " + result + " (тоже грустно)");
        }
        else System.out.println("Оказалось... Такое продолжение запрещено в РФ");
    }
    public void allVariants() {
        String s;
        s="Возможные варианты: ";
        for (PossibleOutcomesOfChamomile outcome : PossibleOutcomesOfChamomile.values()) {
            s = s + (outcome + ", ");
        }
        String news = s.substring(0, s.length() - 2);
        System.out.println(news);
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
