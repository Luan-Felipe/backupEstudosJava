import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença de A e B pelo produto de C e D segundo a fórmula: DIFERENÇA = (A * B - C * D)

        Scanner entrada = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;

        System.out.println("Digite os valores de A, B, C, D na mesma linha separados por espaço");
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();
        DIFERENCA = (A  * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);

    }
}
