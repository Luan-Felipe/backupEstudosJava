import java.util.Scanner;
import java.util.Locale;

//Leia 1 valor inteiro N, que representa o número de casas de teste que vem a seguir. Cada casa de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

public class Ex_006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeEntradas = entrada.nextInt();

        for (int i = 1; i <= quantidadeDeEntradas; i++){
            double entrada1 = entrada.nextDouble();
            double entrada2 = entrada.nextDouble();
            double entrada3 = entrada.nextDouble();
            double mediaPonderada = ((entrada1 * 2) + (entrada2 * 3) + (entrada3 * 5)) / 10;
            System.out.printf("%.1f%n", mediaPonderada);
        }
        entrada.close();
    }
}
