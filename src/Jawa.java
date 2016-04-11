import java.util.ArrayList;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Jawa extends Character {
    public Jawa(String name) {
        super(name);
        hp = 400;
        def = 400;
        power = 400;
        force = 0;
        intelligence = 400;
        type = "Jawa";
    }

    public ArrayList<String> getAttaks()
    {
        ArrayList<String> attaks = new ArrayList<>();
        attaks.add("physical");
        attaks.add("armed");

        return attaks;
    }

}