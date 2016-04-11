import java.util.ArrayList;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class ImperialAgent extends Character {
    public ImperialAgent(String name)
    {
        super(name);
        hp = 350;
        def = 100;
        power = 100;
        force = 0;
        intelligence = 100;
        type = "ImperialAgent";
    }

    public ArrayList<String> getAttaks()
    {
        ArrayList<String> attaks = new ArrayList<>();
        attaks.add("physical");
        attaks.add("armed");

        return attaks;
    }
}
