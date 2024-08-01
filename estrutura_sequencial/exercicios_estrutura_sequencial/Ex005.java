import java.util.Scanner;
import java.util.Locale;

public class Ex005 {
    public static void main(String[] args) {
        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de casa peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostra o valor a ser pago.

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int quantidadePeca1, quantidadePeca2, codigoPeca1, codigoPeca2;
        double valorPeca1, valorPeca2, valorTotal;

        System.out.println("Digite na mesma linha primeiro o codigo da peça 1, depois a quantidade de peças 1 e no final o valor unitario da peça 1");
        codigoPeca1 = entrada.nextInt();
        quantidadePeca1 = entrada.nextInt();
        valorPeca1 = entrada.nextDouble();
        System.out.println("Agora digite na mesma linha o codigo da peça 2, depois a quantidade de peças 2 e no final o valor unitario da peça 2");
        codigoPeca2 = entrada.nextInt();
        quantidadePeca2 = entrada.nextInt();
        valorPeca2 = entrada.nextDouble();
        valorTotal = quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
    }
}
