import java.util.Scanner;
import java.util.Locale;

//leia uma temperatura em celsius e converta para fahrenheit, ao final pergunte se o usuario quer continuar a conversão caso a resposta seja s repita, caso seja n termine o programa.
public class Ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        char resposta;
        do {
            System.out.println("Digite uma temperatura em celsius para converter em fahrenheit");
            int temperaturaCelcius = entrada.nextInt();
            int temperaturaFahrenheit = temperaturaCelcius * 9 / 5 + 32;
            System.out.printf("Temperatura em fahrenheit: %d %n", temperaturaFahrenheit);
            System.out.println("Você quer fazer mais uma conversão ? Digite s para sim ou n para não.");
            resposta = entrada.next().charAt(0);
        } while(resposta != 'n');

        entrada.close();
    }
}
