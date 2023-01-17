package Seminar_01;

import java.util.Arrays;

public abstract class Heroy implements Inter {
    private String name;
    private int attack;
    private int defence;
    private int [] damage;
    private int hp;
    private int speed;

    public Heroy(String name, int attack, int defence, int[] damage, int hp, int speed) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return null;
    }

    public String getName() {
        return name;
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

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Name=" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                ", damage=" + Arrays.toString(damage) +
                ", hp=" + hp +
                ", speed=" + speed;
    }
}
