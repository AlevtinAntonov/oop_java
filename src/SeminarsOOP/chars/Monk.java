package SeminarsOOP.chars;

import java.util.ArrayList;
import java.util.List;

import static SeminarsOOP.Main.darkSide;

public class Monk extends UnitBase {
    private boolean magic;

    public Monk(List<UnitBase> gang, String name, int x, int y) {
        super(12, 7, new int[]{-4,-4}, 30, 5, name,
                "Monk");
        magic = true;
        super.gang = gang;
        super.position = new Vector2(x, y);
    }

    @Override
    public String toString() {
        return "\n Монах: " + super.toString() + ", magic=" + magic;
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
        double maxLostPercent = 0;
        int maxLostIndex = 0;
        for (int i = 0; i < darkSide.size(); i++) {
            String[] params = darkSide.get(i).getMaxLost().split(" ");
            if (Double.parseDouble(params[1]) != Double.parseDouble(params[2])) {
                double temp = (Double.parseDouble(params[1]) - Double.parseDouble(params[2])) /
                              Double.parseDouble(params[1]) * 100;
                if (temp > maxLostPercent) {
                    maxLostPercent = temp;
                    maxLostIndex = i;
                }
            }
        }
//        System.out.println("Максимальный урон %: " + maxLostPercent + ", Индекс: " + maxLostIndex);


        if (magic) {
            int healer = (int) (darkSide.get(maxLostIndex).health + (darkSide.get(maxLostIndex).maxHealth *
                                                                     maxLostPercent / 100 / 2));
            if (healer <= darkSide.get(maxLostIndex).maxHealth) {
                darkSide.get(maxLostIndex).setHealth(healer);
            } else {
                darkSide.get(maxLostIndex).setHealth(darkSide.get(maxLostIndex).maxHealth);
            }
//            System.out.println("Монах: " + name + " вылечил -> " +
//                               darkSide.get(maxLostIndex).role + " имя: " +
//                               darkSide.get(maxLostIndex).name +
//                               " здоровье стало -> " + darkSide.get(maxLostIndex).health);
        } else {
//            System.out.println("Магия закончилась :) ");
        }
    }
}
