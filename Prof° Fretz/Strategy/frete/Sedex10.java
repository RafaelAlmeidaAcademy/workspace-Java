public class Sedex10 implements IFrete{

    @Override
    public double calcularPreco(int d) {
        return d * 1.65 + 10;
    }


}