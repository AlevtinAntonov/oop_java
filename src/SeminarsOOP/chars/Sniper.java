package SeminarsOOP.chars;

import java.util.ArrayList;
import java.util.List;

import static SeminarsOOP.Main.whiteSide;

public class Sniper extends UnitBase {
    protected int shots;

    public Sniper(List<UnitBase> gang, String name, int x, int y) {
        super(12, 10, new int[]{8, 10}, 15, 9, name,
                "Sniper");
        shots = 32;
        super.gang = gang;
        super.position = new Vector2(x, y);
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }


    @Override
    public String toString() {
        return "\n Снайпер: " + super.toString() + ", shots=" + shots;
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
        if (shots > 0){
            shots -= 1;
//            System.out.println("Снайпер: "+ name + " выстрелил, осталось стрел: " + shots);
        } else {
//            System.out.println("У Снайпера: "+ name + " -> Стрелы закончились :)");
        }

        for (int i = 0; i < whiteSide.size(); i++) {

            if ((whiteSide.get(i).role == "Peasant") && ((Peasant) whiteSide.get(i)).status == 1){
                shots +=1;
                ((Peasant) whiteSide.get(i)).setStatus(0);
//                System.out.println("Крестьянин " + ((Peasant) whiteSide.get(i)).name + " принес стрелу Снайперу: "
//                                   + name + ", стало стрел -> " + shots);
                break;
            }
        }
    }
}
