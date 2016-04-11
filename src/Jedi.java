import java.util.ArrayList;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Jedi extends Character {
    public Jedi(String name) {
        super(name);
        this.hp = 100;
        this.def = 200;
        this.power = 100;
        this.force = 200;
        this.intelligence = 200;
        this.type = "Jedi";
    }

    public ArrayList<String> getAttaks()
    {
        ArrayList<String> attaks = new ArrayList<>();
        attaks.add("force");
        attaks.add("physical");
        attaks.add("armed");

        return attaks;
    }

}