public class Sedex implements IFrete{

    @Override
    public double calcularPreco(int d) {
        return d * 1.45 + 10;
    }


}