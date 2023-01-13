package Lesson_07.Ex006;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(200) + 100);
        this.maxMana = Magician.r.nextInt(150) + 50;
        this.mana = maxMana;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(30) + 20;
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}