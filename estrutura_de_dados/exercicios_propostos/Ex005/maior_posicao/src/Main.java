import java.util.Scanner;
import java.util.Locale;
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição  do maior elemento, considerando a primeira posição como 0.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNumerosDigitados, posicaoDoMaiorNumero = 0;
        double maiorValor = 0;
        double[] arranjoDeNumeros;
        System.out.print("Quantos numeros voce vai digitar? ");
        quantidadeDeNumerosDigitados = entrada.nextInt();
        arranjoDeNumeros = new double[quantidadeDeNumerosDigitados];

        for (int i = 0; i < arranjoDeNumeros.length; i++){
            System.out.print("Digite um numero: ");
            arranjoDeNumeros[i] = entrada.nextDouble();
        }

        for (int i = 0; i < arranjoDeNumeros.length; i++) {
            if (arranjoDeNumeros[i] > maiorValor){
                maiorValor = arranjoDeNumeros[i];
                posicaoDoMaiorNumero = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicaoDoMaiorNumero);

        entrada.close();
    }
}