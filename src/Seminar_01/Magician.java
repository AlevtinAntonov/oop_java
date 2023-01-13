package Seminar_01;

public class Magician extends Heroy {
    private int magic;

    public Magician(String name, int attack, int defence, int[] damage, int hp, int speed, int magic) {
        super(name, attack, defence, damage, hp, speed);
        this.magic = magic;
    }
    public Magician(String name){
        this(name, 17, 12, new int[]{-5}, 30, 9, 1);
    }

    @Override
    public String toString() {
        return super.toString() + ", magic=" + magic ;
    }
}
