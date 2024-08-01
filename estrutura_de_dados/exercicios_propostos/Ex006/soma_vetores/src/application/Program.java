package application;
import java.util.Scanner;

//Faça um programa para lerdois vatores A e B, contendo N elementos em cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeValores;
        int[] vetorA;
        int[] vetorB;
        int[] vetorC;

        System.out.print("Quantos valores vai ter cada vetor? ");
        quantidadeDeValores = entrada.nextInt();
        vetorA = new int[quantidadeDeValores];
        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = entrada.nextInt();
        }

        vetorB = new int[quantidadeDeValores];
        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = entrada.nextInt();
        }

        vetorC = new int[quantidadeDeValores];
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

        entrada.close();
    }
}