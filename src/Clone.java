import java.util.ArrayList;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Clone extends Character {
    public Clone(String name) {
        super(name);
        this.hp = 100;
        this.def = 100;
        this.power = 100;
        this.force = 0;
        this.intelligence = 100;
        this.type = "Clone";
    }

    public ArrayList<String> getAttaks()
    {
        ArrayList<String> attaks = new ArrayList<>();
        attaks.add("armed");
        attaks.add("physical");

        return attaks;
    }

}