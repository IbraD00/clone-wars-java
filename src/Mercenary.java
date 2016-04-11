import java.util.ArrayList;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Mercenary extends Character {
    public Mercenary(String name) {
        super(name);
        hp = 100;
        def = 350;
        power = 100;
        force = 0;
        intelligence = 100;
        type = "Mercenary";
    }

    public ArrayList<String> getAttaks()
    {
        ArrayList<String> attaks = new ArrayList<>();
        attaks.add("armed");
        attaks.add("physical");

        return attaks;
    }

}