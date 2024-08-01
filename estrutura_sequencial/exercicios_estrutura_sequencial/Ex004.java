import java.util.Scanner;
import java.util.Locale;

public class Ex004 {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um  funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int number, hours;
        double incomePerHour, salary;

        number = entrada.nextInt();
        hours = entrada.nextInt();
        incomePerHour = entrada.nextDouble();
        salary = hours * incomePerHour;
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + salary);


    }
}
