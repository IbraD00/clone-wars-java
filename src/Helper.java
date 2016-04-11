import java.util.Scanner;

/**
 * Created by IbraD00 et Adam on 04/03/2016.
 */
abstract class Helper {

    public Helper()
    {

    }

    public static String scan()
    {
        Scanner scan = null;

        try {
            scan = new Scanner(System.in);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return scan.nextLine();
    }

}
