import java.util.Scanner;

public class SanduicheStore{

    public SimpleSanduicheFactory sanduicheFactory;

    public void orderSanduiche(){
        System.out.println("---------MENU-------");
        System.out.println(" 0 - XBacon ");
        System.out.println(" 1 - XEgg");
        System.out.println(" 2 - XFrango");
        System.out.println(" 3 - XTudo");
        System.out.println("--------------------");
        System.out.print("->");
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();
        switch(op)
        {

        }
    }
}