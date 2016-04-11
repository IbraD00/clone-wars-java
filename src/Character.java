import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
abstract class Character {
    protected int hp;
    protected int def;
    protected int power;
    protected int force;
    protected int intelligence;
    protected int lvl;
    protected int xp;
    protected String type;
    protected String name;

    public Character(String name) {
        this.hp = 0;
        this.def = 0;
        this.power = 0;
        this.force = 0;
        this.intelligence = 0;
        this.lvl = 1;
        this.xp = 0;
        this.type = null;
        if(this.name == null) {
            this.name = name;
        }else {
            this.name = null;
        }
    }

    public void lvlUp(){
        lvl = lvl++;
        hp = (int)(hp * 1.5);
        def = (int)(def * 1.5);
        power = (int)(power * 1.5);
        if(Objects.equals(type, "Jedi") || Objects.equals(type, "Sith")) {
            force = (int)(force * 1.5);
        }
        intelligence = (int)(intelligence * 1.5);
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

    public void forceAttack(Character ennemy) {
        ennemy.hp -= (force/10) * 2;
    }

    public static ArrayList getEnemies()
    {
        ArrayList<Integer> enemies = new ArrayList<>();
        enemies.add(0);
        enemies.add(1);
        enemies.add(2);
        enemies.add(3);
        enemies.add(4);
        enemies.add(5);

        return enemies;
    }

    public static ArrayList getHeroes()
    {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Jedi");
        heroes.add("Sith");
        heroes.add("BountyHunters");
        heroes.add("ImperialAgent");
        heroes.add("Mercenary");
        heroes.add("Jawa");

        return heroes;
    }

    public static Character getHero(String name)
    {
        System.out.println("Votre classe ");
        String type =  Helper.scan();
        Character hero = null;
        ArrayList heroes = getHeroes();

        if(heroes.contains(type)) {
            switch (type) {
                case "Jedi":
                    hero = new Jedi(name);
                    System.out.println("je suis Jedi");
                    break;
                case "Sith":
                    hero = new Sith(name);
                    System.out.println("je suis Sith");
                    break;
                case "BountyHunters":
                    hero = new BountyHunters(name);
                    System.out.println("je suis BountyHunters");
                    break;
                case "ImperialAgent":
                    hero = new ImperialAgent(name);
                    System.out.println("je suis ImperialAgent");
                    break;
                case "Mercenary":
                    hero = new Mercenary(name);
                    System.out.println("je suis Mercenary");
                    break;
                case "Jawa":
                    hero = new Jawa(name);
                    System.out.println("je suis Jawa");
                    break;
            }
        }
        else {
            System.out.println("Pas cool class non trouvé");

            return getHero(name);
        }

        return hero;
    }

    public void updateXp(Character enemy)
    {
        xp = xp + enemy.lvl;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getAttaks()
    {
        ArrayList<String> attaks = new ArrayList<>();

        return attaks;
    }

}

