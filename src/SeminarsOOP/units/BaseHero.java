package SeminarsOOP.units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class BaseHero implements InterfaceHero {
    int attack, defence, maxHealth, speed, health;
    int[] damage;
    String name, role;


    public BaseHero(int attack, int defence, int[] damage, int maxHealth, int speed, String name,
                    String role) {
        this.attack = attack;
        this.defence = defence;
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

    public String getRole() { return role;}

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
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
    public int step(ArrayList<BaseHero> heroesList) {

        return 0;
    }

    @Override
    public String getInfo() {
        return role + " " + String.valueOf(maxHealth) + " " + String.valueOf(health) ;
    }

    @Override
    public String toString() {
        return name +
                ", role=" + role +
                ", attack=" + attack +
                ", defence=" + defence +
                ", damage=" + Arrays.toString(damage) +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                ", speed=" + speed;
    }
}
