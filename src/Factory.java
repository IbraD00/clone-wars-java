import java.util.ArrayList;
import java.util.Random;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Factory {

    private static Factory INSTANCE = null;

    public Factory()
    {
    }

    public static Factory getInstance()
    {
        if (INSTANCE == null)
        { 	INSTANCE = new Factory();
        }

        return INSTANCE;
    }

    public void create(int heroLvl)
    {
        generateEnemy(heroLvl);
    }

    public Character generateEnemy(int heroLvl)
    {
        Character enemy = null;
        Random generator = new Random();
        ArrayList enemies = Character.getEnemies();
        int min = 0;
        int type = generator.nextInt((enemies.size() - min) + min);
        if(type < 6){
            switch (type) {
                case 0:
                case 1:
                case 2:
                    enemy = new Clone("");
                    break;
                case 3:
                case 4:
                    enemy = new Soldat("");
                    break;
                case 5:
                    enemy = new Droid("");
                    break;
            }
        }else {
            System.out.println("Erreur avec le type "+type);
        }

        System.out.println("Vous allez affronter...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        if (enemy != null) {
            enemy.setLvl(generateLvl(heroLvl));
            System.out.println(enemy.getLvl());
            int count = enemy.getLvl();
            System.out.println(count);

            if(count != 1) {
                for (int i = 0; i < count; i++) {
                    enemy.lvlUp();
                }
            }

            System.out.println("Enemy: "+enemy.type);
            System.out.println("Level: "+enemy.getLvl());
            System.out.println("Hp: "+enemy.hp);;
            System.out.println("Def: "+enemy.def);
            System.out.println("Power: "+enemy.power);
            System.out.println("Force: "+enemy.force);
            System.out.println("Intelligence: "+enemy.intelligence);
        }

        return enemy;

    }

    public int generateLvl(int heroesLvl)
    {
        int maxLvl = heroesLvl + 2;
        Random generator = new Random();

        return generator.nextInt((maxLvl - heroesLvl) + 1) + heroesLvl;
    }
}
