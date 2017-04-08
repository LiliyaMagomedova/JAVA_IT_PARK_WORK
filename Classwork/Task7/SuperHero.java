/**
 * Created by Student20 on 01.04.2017.
 */
public class SuperHero {
    protected String name;
    protected int enemiesamount;

    public SuperHero(String name, int enemiesamount) {
        this.name = name;
        this.enemiesamount = enemiesamount;
    }

    public int getEnemiesamount() {
        return enemiesamount;
    }

    public String getName() {
        return name;
    }
}
