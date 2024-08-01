import java.util.Scanner;
import java.util.Locale;

//Fazer um programa para ler um número inteiro N e depois N números reais. Em seguida mostrar na tela a média de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeElementos;
        double[] elementos ;
        double somatoria = 0, media = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        quantidadeDeElementos = entrada.nextInt();
        elementos = new double[quantidadeDeElementos];

        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Digite um numero: ");
            elementos[i] = entrada.nextDouble();
            somatoria += elementos[i];
        }

        media = somatoria / quantidadeDeElementos;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i] < media) System.out.println(elementos[i]);
        }
        entrada.close();
    }
}