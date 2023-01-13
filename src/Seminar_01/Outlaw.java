package Seminar_01;

public class Outlaw extends Heroy{

    public Outlaw(String name){
        this(name, 8, 3, new int[] {2,4}, 10, 6);
    }

    public Outlaw(String name, int attack, int defence, int[] damage, int hp, int speed) {
        super(name, attack, defence, damage, hp, speed);
    }

}
