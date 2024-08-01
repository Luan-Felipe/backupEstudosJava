import java.util.Locale;
import java.util.Scanner;
// Operadores de atribuição cumulativa +=, -=, *=, /=, %=. Nesse programa devemos calcular o valor da contra telefonica, sabendo que até 100 minutos consumidos o valor da conta é de R$50.00 e após os 100 minutos é cobrado 2 reais por minuto consumido;
public class Ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int minutos;
        double conta = 50.00;

        System.out.println("Digite a quantidade de minutos consumidos no mes");
        minutos = entrada.nextInt();

        if (minutos > 100){
            //conta = conta + (minutos - 100) * 2; = mesma coisa que a linha de baixo.
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("O valor da sua conta é R$ %.2f%n", conta);
        entrada.close();
    }
}
