
public class SimpleSanduicheFactory{
    public Sanduiches sanduiches;

    public Sanduiches createSanduiche(int sanduiche, int cut, int box)
    {
        switch(op)
        {
            case 0:
                sanduiches = new XBacon();
                break;
            case 1:
                sanduiches = new XEgg();
                break;
            case 2:
                sanduiches = new XFrango();
                break;
            case 3:
                sanduiches = new XTudo();
                break;
        }

        sanduiches.prepare();
        sanduiches.cut(cut);
        sanduiches.box(box);
        return sanduiches;
    }
}