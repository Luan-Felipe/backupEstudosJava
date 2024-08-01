import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        // Faça um programa para ler dois valores inteiros, e depois de mostrar na tela a soma desse números com uma mensagem explicativa.
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, soma;

        System.out.println("Digite um numero inteiro");
        numero1 = sc.nextInt();
        System.out.println("Digite mais um numero inteiro");
        numero2 = sc.nextInt();
        soma = numero1 + numero2;
        System.out.println("SOMA = " + soma);
    }
}
