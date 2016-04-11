import java.util.ArrayList;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class BountyHunters extends Character {
    public BountyHunters(String name)
    {
        super(name);
        hp = 100;
        def = 100;
        power = 100;
        force = 0;
        intelligence = 350;
        type = "BountyHunters";
    }

    public ArrayList<String> getAttaks()
    {
        ArrayList<String> attaks = new ArrayList<>();
        attaks.add("physical");

        return attaks;
    }
}
