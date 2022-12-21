import heroes.*;
import heroesSkills.*;
import place.*;
import chamomile.*;

public class Main {
    public static void main(String[] args) {
        Winnie winnie = new Winnie(Place.RABBITHOUSE);
        Rabbit rabbit = new Rabbit(Place.RABBITHOUSE);
        Piglet piglet = new Piglet(Place.GROUND);
        Chamomile chamomile = new Chamomile();
        System.out.println(winnie.farewell(rabbit));
        System.out.println(winnie.winnieRun(Place.PIGLETHOUSE));
        piglet.pigletActivity(Place.GROUND, "сидит");
        System.out.println(piglet.pigletWonders());
        chamomile.allVariants();
        chamomile.resultOfChamomile(PossibleOutcomesOfChamomile.SPIT);
        System.out.println(piglet.pigletForget());
        System.out.println(piglet.pigletHopes(winnie));
        winnie.setLocation(Place.PIGLETHOUSE);
        System.out.println(winnie.winnieAdvent());
    }
}

