import java.util.ArrayList;

public abstract class Sanduiches {
    protected ArrayList toppings = new ArrayList();
    protected String box;
    protected String cut;


    public void prepare(){
        this.toppings.add("Bread");
        this.toppings.add("Hamburger");
        this.toppings.add("Cheese");
        this.toppings.add("Lettuce");
        this.toppings.add("Tomato");
        this.toppings.add("Onion");
    }

    public void cut(int op){
        switch(op){
            case 0:
                this.cut = "x1 pieces";
                break;
            case 1:
                this.cut = "x2 pieces";
                break;
            case 4:
                this.cut = "x4 pieces";
                break;
        }
    }
    public void box(int op)
    {
        switch(op){
            case 0:
                this.box = "Eat now.";
                break;
            case 1:
                this.box = "For travel.";
             break;
        }
    }

    public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String )toppings.get(i) + "\n");
		}
		return display.toString();
	}

}