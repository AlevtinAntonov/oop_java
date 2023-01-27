package SeminarsOOP.chars;

import java.util.ArrayList;
import java.util.List;

import static SeminarsOOP.Main.whiteSide;

public class Magician extends UnitBase {
    private boolean magic;

    public Magician(List<UnitBase> gang,String name, int x, int y) {
        super(17, 12, new int[]{-5, -5}, 30, 9,
                name, "Magician");
        magic = true;
        super.gang = gang;
        super.position = new Vector2(x, y);

    }


    @Override
    public String toString() {
        return "\n Колдун: " + super.toString() + ", magic=" + magic;
    }

    @Override
    public void step(ArrayList<UnitBase> heroList) {
        double maxLostPercent = 0;
        int maxLostIndex = 0;
        for (int i = 0; i < whiteSide.size(); i++) {
            String[] params = whiteSide.get(i).getMaxLost().split(" ");
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
            int healer = (int) (whiteSide.get(maxLostIndex).health + (whiteSide.get(maxLostIndex).maxHealth *
                                                                      maxLostPercent / 100 / 2));
            if (healer <= whiteSide.get(maxLostIndex).maxHealth) {
                whiteSide.get(maxLostIndex).setHealth(healer);
            } else {
                whiteSide.get(maxLostIndex).setHealth(whiteSide.get(maxLostIndex).maxHealth);
            }
//            System.out.println("Колдун: " + name + " вылечил -> " +
//                               whiteSide.get(maxLostIndex).role + " имя: " +
//                               whiteSide.get(maxLostIndex).name +
//                               " здоровье стало -> " + whiteSide.get(maxLostIndex).health);
        } else {
//            System.out.println("Магия закончилась :) ");
        }
    }

}
