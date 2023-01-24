package SeminarsOOP.units;

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

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
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
                double temp = (Double.parseDouble(params[1]) - Double.parseDouble(params[2])) /
                        Double.parseDouble(params[1]) * 100;
                if (temp > maxLostPercent) {
                    maxLostPercent = temp;
                    maxLostIndex = i;
                }
            }
        }
        System.out.println("Максимальный урон %: " + maxLostPercent + ", Индекс: " + maxLostIndex);

        if (magic > 0) {
            int healer = (int) (heroesList.get(maxLostIndex).health + (heroesList.get(maxLostIndex).maxHealth *
                    maxLostPercent / 100 / 2));
            if (healer <= heroesList.get(maxLostIndex).maxHealth) {
                heroesList.get(maxLostIndex).setHealth(healer);
            } else {
                heroesList.get(maxLostIndex).setHealth(heroesList.get(maxLostIndex).maxHealth);
            }
            System.out.println("Колдун: " + name + " вылечил -> " +
                    heroesList.get(maxLostIndex).role + " имя: " +
                    heroesList.get(maxLostIndex).name +
                    " здоровье стало -> " + heroesList.get(maxLostIndex).health);
            magic -= 1;
        } else {
            System.out.println("Магия закончилась :) ");
        }
        return magic;
    }

}
