import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Adam on 29/02/2016.
 */
public class Player extends Character {
    private String name;
    Character unit = null;

    String recup = null;
    Scanner scanner = null;

    ArrayList<String> heroes = new ArrayList<>();

    public Player(){
        super();
        scanner = new Scanner(System.in);
        heroes.add("Jedi");
        heroes.add("Sith");
        heroes.add("BountyHunters");
        heroes.add("ImperialAgent");
        heroes.add("Mercenary");
        heroes.add("Jawa");
    }

    public void playerName(){
        recup = scanner.nextLine();
        this.name = recup;

    }

    public void playerClasse(){
        recup = scanner.nextLine();

        if(heroes.contains(recup)) {
            switch (recup) {
                case "Jedi":
                    unit = new Jedi();
                    System.out.println("je suis Jedi");
                    break;
                case "Sith":
                    unit = new Sith();
                    System.out.println("je suis Sith");
                    break;
                case "BountyHunters":
                    unit = new BountyHunters();
                    System.out.println("je suis BountyHunters");
                    break;
                case "ImperialAgent":
                    unit = new ImperialAgent();
                    System.out.println("je suis ImperialAgent");
                    break;
                case "Mercenary":
                    unit = new Mercenary();
                    System.out.println("je suis Mercenary");
                    break;
                case "Jawa":
                    unit = new Jawa();
                    System.out.println("je suis Jawa");
                    break;
            }
        }
        else {
            System.out.println("Pas cool essaye encore");
            playerClasse();
        }
    }

//    public void Attack(){
//        recup = scanner.nextLine();
//        switch (attack) {
//            case "force":
//                if (unit.type == "Jedi" || unit.type == "Sith") {
//                } else
//                    System.out.println("Nope tu peux pas");
//                break;
//            case "armed":
//                if (unit.type != "Jedi" || unit.type != "Sith") {
//                    armedAttack(enemy);
//                } else
//                    System.out.println("Nope tu peux pas");
//                break;
//            case "physical":
//                physicalAttack(enemy);
//                break;
//        }
//    }

    public void lvlUp(){
        unit.hp = (int)(unit.hp * 1.5);
        unit.def = (int)(unit.def * 1.5);
        unit.power = (int)(unit.power * 1.5);
        unit.force = (int)(unit.force * 1.5);
        unit.intelligence = (int)(unit.intelligence * 1.5);
        unit.lvl += 1;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
