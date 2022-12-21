package heroesSkills;
import chamomile.Chamomile;
import place.*;
import heroes.Hero;

public interface PigletSkills extends FairyCreature {
    void pigletActivity(Place location,String activity);
    String pigletForget();
    String pigletHopes(Hero hero);
    String pigletWonders();

}