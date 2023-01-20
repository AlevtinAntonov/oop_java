package Lesson_08.Ex002;

public class Druid extends BaseHero {
    private int harmony;
    private int maxHarmony;

    public Druid() {
        super(String.format("Hero_Druid #%d", ++Druid.number),
                Magician.r.nextInt(200) + 100);
        this.maxHarmony = Magician.r.nextInt(150) + 50;
        this.harmony = maxHarmony;
    }

    public String getInfo() {
        return String.format("%s  Harmony: %d", super.getInfo(), this.harmony);
    }

    public void healing(BaseHero target) {
        int heal = BaseHero.r.nextInt(20) + 10;
        if (this.harmony >= heal) {
            target.healed(heal);
        }
    }
}