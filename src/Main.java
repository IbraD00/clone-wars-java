import java.util.Scanner;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Star Wars: Clone Wars");
        Character hero = initPlayer();
        initRoom(hero);
    }

    public static Character initPlayer()
    {
        System.out.println("Votre nom: ");
        String name = Helper.scan();
        System.out.println("Salut "+name);
        Character hero = Character.getHero(name);

        return hero;
    }

    public static void initRoom(Character hero)
    {
        System.out.println("Veuillez entrer une zone: ");
        try
        {
            int zone = Integer.parseInt(Helper.scan());
            Room room = new Room(zone);
            room.create(hero);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
