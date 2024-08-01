import java.util.Locale;
import java.util.Scanner;

//Ler um valor n, em seguida n alturas e armazenar em um vetor de n posições. Após isso ler os valores e apresentar media das altura.
public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alturas que serão calculada na média.");
        int numeroDeAlturas = entrada.nextInt();
        double[] vetor = new double[numeroDeAlturas];

        System.out.println("Agora digite em sequencia as alturas");
        for (int i = 0; i < numeroDeAlturas; i++){
            vetor[i] = entrada.nextDouble();
        }

        double soma = 0.0;

        for (int i = 0; i < numeroDeAlturas; i++){
            soma += vetor[i];
        }

        double media = soma / numeroDeAlturas;

        System.out.printf("Media das %d altura: %.2f", numeroDeAlturas, media);
    }
}