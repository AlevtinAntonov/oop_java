package Lesson_08.Ex002;

import Lesson_08.Ex002.Magician;

public class Druid extends BaseHero {
    private int harmony;
    private int maxHarmony;

    public Druid() {
        super(String.format("Hero_Druid #%d", ++Druid.number),
                Magician.r.nextInt(200) + 100);
        this.harmony = harmony;
        this.maxHarmony = maxHarmony;
    }

    @Override
    public String getInfo() {
        return String.format("%s Harmony: %d", super.getInfo(), this.harmony);
    }
    public void healing(BaseHero target) {
        int heal = BaseHero.r.nextInt(20)+10;
        if (this.harmony >= heal) {
            target.healed(heal);
        }
    }

    @Override
    public void die() {
//        TODO auto-generate
    }
}
