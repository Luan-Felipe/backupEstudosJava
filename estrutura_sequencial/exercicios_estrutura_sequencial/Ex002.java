import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        // Faça um programa para let o valor do raio de um círculo, e depois mostrar o valor de área deste círculo com quatro casas decimais. Considere o valor de pi = 3.14159 e a formula area = pi * raio².
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159, raio, A;

        System.out.println("Entre com o valor do raio em valor decimal");
        raio = sc.nextDouble();
        A = pi * Math.pow(raio, 2.0);
        System.out.printf("A = %.4f", A);
    }
}
