import java.util.Scanner;

//Estrutura condicional composta, controla o fluxo da aplicação dependendo se a resposta a condição é verdadeira ou não.
public class Ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora;
        System.out.println("Que horas são?");
        hora = entrada.nextInt();

        if (hora > 12) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Bom dia");
        }
        entrada.close();
    }
}
