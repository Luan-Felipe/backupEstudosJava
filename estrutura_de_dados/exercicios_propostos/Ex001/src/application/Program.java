package application;

import java.util.Scanner;

//Faça um programa que leia um número inteiro positivo N (maximo = 10) e depois N números inteiros e armazene-os em um vetor.Em seguida, mostrat na tela todos os números negativos lidaos.
public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidadeDeNumeros = entrada.nextInt();
        int[] vetorDeNumeros = new int[quantidadeDeNumeros];


        for (int i = 0; i < vetorDeNumeros.length; i++){
            System.out.print("Digite um numero: ");
            vetorDeNumeros[i] = entrada.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < vetorDeNumeros.length; i++){
            if(vetorDeNumeros[i] < 0) System.out.println(vetorDeNumeros[i]);
        }

        entrada.close();
    }
}