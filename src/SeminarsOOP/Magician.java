package SeminarsOOP;

import java.util.ArrayList;

public class Magician extends BaseHero {
    int magic;

    public Magician(int attack, int defence, int[] damage, int maxHealth, int speed, String name,
                    String role, int magic) {
        super(attack, defence, damage, maxHealth, speed, name, role);
        this.magic = magic;
    }

    public Magician(String name) {
        this(17, 12, new int[]{-5}, 30, 9,
                name, "Magician", 1);
    }

    @Override
    public String toString() {
        return "\n Magician: " + super.toString() + ", magic=" + magic;
    }

    @Override
    public int step(ArrayList<BaseHero> heroesList) {
        double maxLostPercent = 0;
        int maxLostIndex = 0;
        for (int i = 0; i < heroesList.size(); i++) {
            String[] params = heroesList.get(i).getInfo().split(" ");
            if (Integer.parseInt(params[1]) != Integer.parseInt(params[2])) {
                double temp = (Double.parseDouble(params[1]) - Double.parseDouble(params[2])) / Double.parseDouble(params[1]) * 100;
                if (temp > maxLostPercent) {
                    maxLostPercent = temp;
                    maxLostIndex = i;
                }
            }
        }
        System.out.println("Урон %: " + maxLostPercent + ", Индекс: " + maxLostIndex);
        heroesList.get(maxLostIndex).setHealth(heroesList.get(maxLostIndex).maxHealth);
        System.out.println(heroesList.get(maxLostIndex));
        System.out.println("----------------------------");
        return maxLostIndex;
    }

}
