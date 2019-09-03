
public class SimpleSanduicheFactory{
    public Sanduiches sanduiches;

    public Sanduiches createSanduiche(int sanduiche, int cut, int box)
    {
        switch(sanduiche)
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

        this.sanduiches.prepare();
        this.sanduiches.cut(cut);
        this.sanduiches.box(box);
        return this.sanduiches;
    }
}