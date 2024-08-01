import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        //Encadeamento de estruturas condicionais servem para verificar mais de duas condições;
        Scanner entrada = new Scanner(System.in);
        int hora;

        System.out.println("Que horas são? (Digite um valor inteiro formato de 24h)");
        hora = entrada.nextInt();

        if (hora >= 0 && hora <= 12) {
            System.out.println("Bom dia!");
        } else if (hora > 12 && hora <= 18) {
            System.out.println("Boa tarde!");
        } else if (hora > 18 && hora <= 24) {
            System.out.println("Boa noite! Vai nanar!");
        } else {
            System.out.println("Hora invalida, seu bandindinho");
        }
        entrada.close();
    }
}


