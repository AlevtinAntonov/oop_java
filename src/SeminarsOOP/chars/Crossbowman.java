package SeminarsOOP.chars;

import java.util.ArrayList;
import java.util.List;

import static SeminarsOOP.Main.darkSide;

public class Crossbowman extends UnitBase {
    int shots;

    public Crossbowman(List<UnitBase> gang, String name, int x, int y) {
        super(6, 3, new int[]{2, 3}, 10, 4,
                name, "Crossbowman");
        shots = 16;
        super.gang = gang;
        super.position = new Vector2(x, y);
    }

    @Override
    public String toString() {
        return "\n Арбалетчик: " + super.toString() + ", shots=" + shots;
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
        if (shots > 0){
            shots -= 1;
//            System.out.println("Арбалетчик: "+ name + " выстрелил, осталось стрел: " + shots);
        } else {
//            System.out.println("У Арбалетчика: "+ name + " -> Стрелы закончились :)");
        }

        for (int i = 0; i < darkSide.size(); i++) {
            if ((darkSide.get(i).role == "Peasant") && ((Peasant) darkSide.get(i)).status == 1){
                shots +=1;
                ((Peasant) darkSide.get(i)).setStatus(0);
//                System.out.println("Крестьянин " + ((Peasant) darkSide.get(i)).name + " принес стрелу Арбалетчику: "
//                                   + name + ", стало стрел -> " + shots);
                break;
            }
        }
    }
}
