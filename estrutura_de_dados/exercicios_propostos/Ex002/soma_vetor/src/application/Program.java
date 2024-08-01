package application;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N numeros reais e armazene-os em um vetor. Em seguida:
//-Imprimir todos os elementos do vetor
//-Morstar na tela a soma ea média dos elementos do vetor
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double soma = 0.0, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidadeDeNumeros = entrada.nextInt();
        double[] vetorDeReais = new double[quantidadeDeNumeros];

        for (int i = 0; i < vetorDeReais.length; i++){
            System.out.print("Digite um numero: ");
            vetorDeReais[i] = entrada.nextDouble();
            soma += vetorDeReais[i];
        }


        System.out.print("VALORES = ");
        for (int i = 0; i < vetorDeReais.length; i++){
            System.out.print(vetorDeReais[i] + " ");
        }

        media = soma / vetorDeReais.length;

        System.out.printf("%nSOMA = %.2f", soma);
        System.out.printf("%nMEDIA = %.2f",media);
        entrada.close();
    }
}