import java.util.ArrayList;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Droid extends Character {
    public Droid(String name) {
        super(name);
        hp = 50;
        def = 100;
        power = 25;
        force = 0;
        intelligence = 200;
        type = "Droid";
    }

    public void physicalAttack(Character ennemy){
        if(power > ennemy.def) {
            ennemy.hp -= (power - (ennemy.def));
        }
    }

    public void armedAttack(Character ennemy) {
        if(intelligence > ennemy.def) {
            ennemy.hp -= (intelligence - (ennemy.def));
        }
    }



    public ArrayList<String> getAttaks()
    {
        ArrayList<String> attaks = new ArrayList<>();
        attaks.add("armed");
        attaks.add("physical");

        return attaks;
    }

}