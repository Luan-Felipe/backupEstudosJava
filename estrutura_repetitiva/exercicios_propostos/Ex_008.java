import java.util.Scanner;

// ler um valor N. Calcular e escrever seu respectivo fatorial. Lembrando que, por definição, fatorial de 0 é 1.
public class Ex_008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fatorial = entrada.nextInt();

        if (fatorial == 0) fatorial = 1;

        for (int i = fatorial - 1; i >= 1; i--) fatorial *= i;

        System.out.println("fatorial = " + fatorial);
    }
}
