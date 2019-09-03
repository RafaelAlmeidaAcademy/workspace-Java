
public class Simulator {

    public static void main(String[] args)
    {
        SanduicheStore store = new SanduicheStore();
        Sanduiches sanduicheQualquer1 = store.orderSanduiche();
        Sanduiches sanduicheQualquer2 = store.orderSanduiche();
        show(sanduicheQualquer1);
        show(sanduicheQualquer2);
    }

    public static void show(Sanduiches s){
        System.out.println(s.toString());
        System.out.println(" cut: "+s.cut);
        System.out.println(" box: "+s.box);
    }
}