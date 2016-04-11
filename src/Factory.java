import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by IbraD00 on 02/03/2016.
 */
public class Factory {

    private static Factory instance = null;
    private Hashtable<Integer, Character> enemies = new Hashtable<Integer, Character>();

    private Factory()
    {

    }

    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }


    public void buildEnemy(int type)
    {
        enemies.put();

    }

    public void generateEnemy(int nbrEnemy)
    {


    }

    public void generateLvl(int nbrEnemy)
    {

    }
}
