package Lesson_08.Ex001;
 
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
    
    public void attack(BaseHero target) {
        int damage = BaseHero.r.nextInt( 20) + 10;
        target.GetDamage(damage);
    }
}