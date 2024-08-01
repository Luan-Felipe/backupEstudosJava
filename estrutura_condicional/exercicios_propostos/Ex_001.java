package exercicios_propostos;

import java.util.Scanner;

public class Ex_001 {
    public static void main(String[] args) {
        // Fazer um programa para ler o número inteiro, e depois dizer se este número é negativo ou não.
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digitar um valor inteiro negativo ou positivo");
        numero = entrada.nextInt();

        if (numero >= 0) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        entrada.close();
    }
}
