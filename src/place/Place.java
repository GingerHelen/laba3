package place;
import heroes.*;
import heroesSkills.*;

public enum Place {
    GROUND("на земле"),
    PIGLETHOUSE("дому Пятачка"),
    WINNIEHOUSE("дому Винни-Пуха"),
    RABBITHOUSE("дому Кролика"),
    CRISTOPHERHOUSE("Дому Кристофера Роббинса");
    private String seat;

    Place(String seat) {
        this.seat = seat;
    }

    public String toString() {
        return seat;
    }
}
