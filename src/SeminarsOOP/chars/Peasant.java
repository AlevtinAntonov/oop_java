package SeminarsOOP.chars;

import java.util.ArrayList;
import java.util.List;

public class Peasant extends UnitBase {
    private boolean delivery;
    protected int status;

    public Peasant(List<UnitBase> gang, String name, int x, int y) {
        super(1, 1, new int[]{1, 1}, 1, 3, name,
                "Peasant");
        delivery = true;
        status = 1;
        super.gang = gang;
        super.position = new Vector2(x, y);


    }

    public int getStatus() { return status;}


    public void setStatus(int status) {this.status = status;}

    @Override
    public String toString() {
        return "\n Крестьянин: " + super.toString() + ", delivery=" + delivery + ", status=" + status;
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
        status = 1;
    }
}
