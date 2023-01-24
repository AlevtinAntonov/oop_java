package SeminarsOOP.units;

import java.util.ArrayList;

public class Sniper extends BaseHero {
    int shots;

    public Sniper(int attack, int defence, int[] damage, int maxHealth, int speed, String name, String role,
                  int shots) {
        super(attack, defence, damage, maxHealth, speed, name, role);
        this.shots = shots;
    }

    public Sniper(String name) {
        this(12, 10, new int[]{8, 10}, 15, 9, name,
                "Sniper", 32);
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    @Override
    public int step(ArrayList<BaseHero> heroesList) {
        if (shots > 0){
            shots -= 1;
            System.out.println("Снайпер: "+ name + " выстрелил, осталось стрел: " + shots);
        } else {
            System.out.println("У Снайпера: "+ name + " -> Стрелы закончились :)");
        }

        for (int i = 0; i < heroesList.size(); i++) {
            if ((heroesList.get(i).role == "Peasant") && ((Peasant) heroesList.get(i)).status == 1){
                shots +=1;
                ((Peasant) heroesList.get(i)).setStatus(0);
                System.out.println("Крестьянин " + ((Peasant) heroesList.get(i)).name + " принес стрелу Снайперу: "
                        + name + ", стало стрел -> " + shots);
                break;
            }
        }
        return shots;
    }

    @Override
    public String toString() {
        return "\n Sniper: " + super.toString() + ", shots=" + shots;
    }
}
