package SeminarsOOP.chars;
import java.util.ArrayList;
import java.util.List;

public class Spearman extends UnitBase {

    public Spearman(List<UnitBase> gang, String name, int x, int y) {
        super(4, 5, new int[]{1, 3}, 10, 4, name,
                "Spearman");
        super.gang = gang;
        super.position = new Vector2(x, y);
    }

    @Override
    public String toString() {
        return "\n Spearman: " + super.toString();
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {

    }
}
