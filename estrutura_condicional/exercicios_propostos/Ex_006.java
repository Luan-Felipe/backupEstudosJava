package exercicios_propostos;
import java.util.Locale;
import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], [25,50], [50,75], [75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá set impressa a mensagem "Fora do intervalo"

public class Ex_006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double valor;
        System.out.println("Digite um valor decimal de 0 a 100");
        valor = entrada.nextDouble();

        if (valor > 0.00 && valor <= 25.00){
            System.out.println("Intervalo [0, 25]");
        }else if (valor > 25.00 && valor <= 50.00){
            System.out.println("Intervalo [25, 50]");
        }else if (valor > 50.00 && valor <= 75.00){
            System.out.println("Intervalo [50, 75]");
        }else if (valor > 75.00 && valor <= 100.00){
            System.out.println("Intervalo [75, 100]");
        }else{
            System.out.println("Fora de intervalo");
        }

        entrada.close();
    }
}
