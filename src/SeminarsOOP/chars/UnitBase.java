package SeminarsOOP.chars;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.lang.String.format;

public abstract class UnitBase implements InterfaceHero {
    protected int attack, protect, maxHealth, speed;
    protected float health;
    protected int[] damage;
    protected String name, role;
    protected List<UnitBase> gang;
    protected Vector2 position;


    public UnitBase(int attack, int protect, int[] damage, int maxHealth, int speed, String name,
                    String role) {
        this.attack = attack;
        this.protect = protect;
        this.damage = damage;
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.name = name;
        this.role = role;
        this.health = maxHealth - new Random().nextInt(maxHealth);

    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }

    public List<UnitBase> getGang() {
        return gang;
    }

    public String getRole() { return role;}


    public int getAttack() {
        return attack;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }




    @Override
    public String getInfo() {
        String outStr;
        outStr = format("%s\t%s\t⚔ %d\t\uD83D\uDEE1 %d\t♥%.1f\t☠%d\t\uD83C\uDFC3 %d", role, name, attack, protect, health, (damage[0] + damage[1]) / 2,speed);
        return  outStr;
    }

    @Override
    public String getMaxLost() {
        return role + " " + String.valueOf(maxHealth) + " " + String.valueOf(health);
    }

    @Override
    public String toString() {
        return name +
               ", role=" + role +
               ", attack=" + attack +
               ", defence=" + protect +
               ", damage=" + Arrays.toString(damage) +
               ", maxHealth=" + maxHealth +
               ", health=" + health +
               ", speed=" + speed;
    }

    public Vector2 getPosition() {
        return position;
    }
}
