package application;
import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e tamném a quantidade de números pares.
public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNumeros, quantidadeDePares = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        quantidadeDeNumeros = entrada.nextInt();

        int[] numerosDigitados = new int[quantidadeDeNumeros];

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.print("Digite um numero: ");
            numerosDigitados[i] = entrada.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < numerosDigitados.length; i++) {
            if (numerosDigitados[i] % 2 == 0) {
                System.out.printf("%d ", numerosDigitados[i]);
                quantidadeDePares++;
            }
        }

        System.out.printf("%nQUANTIDADE DE PARES = %d", quantidadeDePares);
        entrada.close();
    }
}