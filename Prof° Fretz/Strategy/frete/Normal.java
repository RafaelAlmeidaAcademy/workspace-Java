public class Normal implements IFrete{

    @Override
    public double calcularPreco(int d) {
        return d * 1.25 + 10;
    }


}