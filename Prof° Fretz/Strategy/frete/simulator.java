import java.util.Scanner;
class SimulatorApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a distancia em Km: ");

        int d = scan.nextInt();
        System.out.print("Qual o tipo de frete (1) Normal (2) sedex (3) sedex10 : ");
        int o = scan.nextInt();
        IFrete frete = TipoFrete.values()[0-1].obterFrete();;
        double p = frete.calcularPreco(d);
        System.out.printf("O valor total é de R$%.2f",p);

    }
}