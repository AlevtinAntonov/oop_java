package SeminarsOOP.chars;
import java.util.ArrayList;
import java.util.List;

public class Outlaw extends UnitBase {
    public Outlaw(List<UnitBase> gang, String name, int x, int y) {
        super(8, 3, new int[]{2, 4}, 10, 6, name, "Outlaw");
        super.gang = gang;
        super.position = new Vector2(x, y);
    }

    @Override
    public String toString() {
        return "\n Разбойник: " + super.toString();
    }


    @Override
    public void step(ArrayList<UnitBase> heroesList) {

    }
}
