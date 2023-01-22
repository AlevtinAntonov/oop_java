package SeminarsOOP;

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

    @Override
    public int step(ArrayList<BaseHero> heroesList) {
        boolean isPeasant = false;
        for (int i = 0; i < heroesList.size(); i++) {

            if ((heroesList.get(i).role == "Peasant") && (((Peasant)heroesList.get(i)).status == 1)){
                isPeasant = true;
                ((Peasant)heroesList.get(i)).status = 0;
                break;
                }

            }
        if(!isPeasant){
            shots -= 1;
            }
        System.out.println(shots);
        return shots;
    }

    @Override
    public String toString() {
        return "\n Sniper: " + super.toString() + ", shots=" + shots;
    }
}
