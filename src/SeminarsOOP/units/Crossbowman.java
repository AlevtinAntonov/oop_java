package SeminarsOOP.units;

import java.util.ArrayList;

public class Crossbowman extends BaseHero {
    int shots;

    public Crossbowman(int attack, int defence, int[] damage, int maxHealth, int speed, String name,
                       String role, int shots) {
        super(attack, defence, damage, maxHealth, speed, name, role);
        this.shots = shots;
    }

    public Crossbowman(String name) {
        this(6, 3, new int[]{2, 3}, 10, 4,
                name, "Crossbowman", 16);
    }

    @Override
    public int step(ArrayList<BaseHero> heroesList) {
        if (shots > 0){
            shots -= 1;
            System.out.println("Арбалетчик: "+ name + " выстрелил, осталось стрел: " + shots);
        } else {
            System.out.println("У Арбалетчика: "+ name + " -> Стрелы закончились :)");
        }

        for (int i = 0; i < heroesList.size(); i++) {
            if ((heroesList.get(i).role == "Peasant") && ((Peasant) heroesList.get(i)).status == 1){
                shots +=1;
                ((Peasant) heroesList.get(i)).setStatus(0);
                System.out.println("Крестьянин " + ((Peasant) heroesList.get(i)).name + " принес стрелу Арбалетчику: "
                        + name + ", стало стрел -> " + shots);
                break;
            }
        }
        return shots;
    }

    @Override
    public String toString() {
        return "\n Crossbowman: " + super.toString() + ", shots=" + shots;
    }

}
