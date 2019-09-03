import java.util.Scanner;

public abstract class SanduicheStore{

    public SimpleSanduicheFactory sanduicheFactory = new SimpleSanduicheFactory();

    public Sanduiches orderSanduiche(){
        Scanner scan = new Scanner(System.in);

        System.out.println("---------MENU-------");
        System.out.println(" 0 - XBacon ");
        System.out.println(" 1 - XEgg");
        System.out.println(" 2 - XFrango");
        System.out.println(" 3 - XTudo");
        System.out.println("--------------------");
        System.out.print("->");
        int sanduiche = scan.nextInt();

        System.out.println("--------MENU-------");
        System.out.println(" How munch pieces ?");
        System.out.println(" 0 - x1");
        System.out.println(" 1 - x2");
        System.out.println(" 2 - x4");
        System.out.println("-------------------");
        System.out.print("->");
        int cut = scan.nextInt();

        System.out.println("--------MENU-------");
        System.out.println(" 0 - Eat now;");
        System.out.println(" 1 - For travel.");
        System.out.println("-------------------");
        System.out.print("->");

        int box = scan.nextInt();

        return sanduicheFactory.createSanduiche(sanduiche, cut, box);
    }
}