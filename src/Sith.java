import java.util.ArrayList;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Sith extends Character {
    public Sith(String name) {
        super(name);
        hp = 100;
        def = 100;
        power = 200;
        force = 200;
        intelligence = 200;
        type = "Sith";
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