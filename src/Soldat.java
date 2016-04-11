import java.util.ArrayList;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Soldat extends Character {
    public Soldat(String name) {
        super(name);
        this.hp = 100;
        this.def = 150;
        this.power = 125;
        this.force = 0;
        this.intelligence = 125;
        this.type = "Soldat";
    }


    public ArrayList<String> getAttaks()
    {
        ArrayList<String> attaks = new ArrayList<>();
        attaks.add("armed");
        attaks.add("physical");

        return attaks;
    }

}