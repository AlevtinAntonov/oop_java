package Lesson_08.Ex001;

import Lesson_07.Ex007.BaseHero;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(200) + 100);
        this.maxElixir = Magician.r.nextInt(150) + 50;
        this.elixir = maxElixir;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
