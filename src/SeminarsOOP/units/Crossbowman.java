package SeminarsOOP.units;

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
    public String toString() {
        return "\n Crossbowman: " + super.toString() + ", shots=" + shots;
    }

}
