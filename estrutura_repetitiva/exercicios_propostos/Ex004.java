import java.util.Scanner;
//for é otimo para fazer contagens e para repetir codigos quando sabemos quantas vezes queremos repetir.
//Escreva um código que leia um numero n e que depois leia n numeros, no final some a apresente o resultado da soma para o usuario.
public class Ex004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que quer somar");
        int quantidadeNumeros = entrada.nextInt();
        int soma = 0;

        for (int i = 0; i < quantidadeNumeros; i++){
            soma += entrada.nextInt();
        }

        System.out.printf("A quantidade de numeros que somou foi: %d e o valor da soma é: %d", quantidadeNumeros, soma);
    }
}
