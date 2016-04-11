/**
 * Created by Adam on 29/02/2016.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Star Wars: Clone Wars");
        System.out.println("Votre nom: ");
        player.playerName();
        System.out.println("Votre classe ");
        player.playerClasse();
        System.out.println("Bonjour " + player.getName() +" le " + player.unit.type);
        System.out.println(player.unit.type + " Stat " + player.unit.hp);
        System.out.println("Ohh Enemy");
        player.lvlUp();
        System.out.println(player.unit.hp);
        System.out.println(player.hp);

    }
}
