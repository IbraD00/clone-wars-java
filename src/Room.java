import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Room {
    protected int lvl;

    public Room(int lvl)
    {
        this.lvl = lvl;
    }

    public void create(Character hero)
    {
        System.out.println("Vous entrez en zone "+lvl);
        System.out.println("Vous pouvez affronter des ennemies de niveau "+lvl+"-"+(lvl + 2));
        Factory factory = new Factory();
        Character enemy = factory.generateEnemy(lvl);
        start(hero, enemy);
    }

    public void start(Character hero, Character enemy)
    {
        checkHp(hero, enemy);
        System.out.println("Liste des attaques disponible: ");
        System.out.println(hero.getAttaks());
        System.out.println("Entrer un nom d'attaque: ");
        String attack = Helper.scan();
        if(hero.getAttaks().contains(attack)) {
            launchAttak(hero, enemy, attack);
        } else {
            System.out.println("Attaque non trouvée try again");
            start(hero, enemy);
        }
    }

    public void launchAttak(Character hero, Character enemy, String type)
    {
        switch (type) {
            case "force":
                System.out.println("J'attaque en force");
                hero.forceAttack(enemy);
                break;
            case "physical":
                System.out.println("J'attaque en physical");
                hero.physicalAttack(enemy);
                break;
            case "armed":
                System.out.println("J'attaque en armed");
                hero.armedAttack(enemy);
                break;
        }
        System.out.println("Il reste "+enemy.hp+"HP au "+enemy.type);
        enemyAttack(hero, enemy);
        System.out.println("Il vous reste "+hero.hp+"HP");
        checkLvl(hero, enemy);
        start(hero, enemy);
    }

    public void enemyAttack(Character hero, Character enemy)
    {
        Random generator = new Random();
        ArrayList<String> attacks = enemy.getAttaks();
        int min = 0;
        int type = generator.nextInt((attacks.size() - min) + min);
        switch (type) {
            case 0:
                enemy.armedAttack(hero);
                System.out.println("Vous avez recu une armed attaque");
                break;
            case 1:
                enemy.physicalAttack(hero);
                System.out.println("Vous avez recu une physical attaque");
                break;
        }
    }

    public void enemyStat(Character enemy)
    {
        System.out.println("Enemy: "+enemy.type+" Level: "+enemy.lvl);
        System.out.println("Hp: "+enemy.hp+" Def: "+enemy.def+" Power: "+enemy.power);
        System.out.println("Force: "+enemy.force +" Intelligence: "+enemy.intelligence);
    }

    public void heroStat(Character hero)
    {
        System.out.println("Hero: ("+hero.name+") "+hero.type+" Level: "+hero.lvl);
        System.out.println("Hp: "+hero.hp+" Def: "+hero.def+" Power: "+hero.power);
        System.out.println("Force: "+hero.force +" Intelligence: "+hero.intelligence);
    }


    public void checkHp(Character hero, Character enemy)
    {
        if(hero.hp <= 0) {
            System.out.println("Game over vous êtes mort !");
            heroStat(hero);
            System.out.println("Vous avez été vaincu par ...");
            enemyStat(enemy);
            System.exit(0);
        }

        if(enemy.hp <= 0) {
            hero.updateXp(enemy);
            System.out.println("Vous avez vaincu l'enemie !");
            System.out.println("Que souhaitez vous faire ?");
            System.out.println("0: Continuer dans cette zone 1: Changer de zone 2: Exit");
            String choice = Helper.scan();
            if(Objects.equals(choice, "0")) {
                create(hero);
            }else if(Objects.equals(choice, "1")) {
                Main.initRoom(hero);
            }else {
                System.out.println("Vous êtes un l.... bye !.");
                System.exit(0);
            }
        }
    }

    public void checkLvl(Character hero, Character enemy)
    {
        if(hero.xp >= 10 && hero.lvl == 1) {
            hero.lvlUp();
            System.out.println("Level up  !!!!");
        }

        if(hero.xp >= 100 && hero.lvl == 2) {
            hero.lvlUp();
            System.out.println("Level up  !!!!");
        }
        if(hero.xp >= 300 && hero.lvl == 3) {
            hero.lvlUp();
            System.out.println("Level up  !!!!");
        }

        if(hero.xp >= 350) {
            System.out.println("Vous avez atteint le niveau max");
        }
    }


    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }


}
