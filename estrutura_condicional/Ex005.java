import java.util.Scanner;

//Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo 2=segunda, e assim por diante). Escraver na tela o dia da semana correspondente.
public class Ex005
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia = entrada.nextInt();
        String nomeDoDia;

        switch (dia) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda";
                break;
            case 3:
                nomeDoDia = "Terça";
                break;
            case 4:
                nomeDoDia = "Quarta";
                break;
            case 5:
                nomeDoDia = "Quinta";
                break;
            case 6:
                nomeDoDia = "Sexta";
                break;
            case 7:
                nomeDoDia = "Sabado";
                break;
            default:
                nomeDoDia = "Dia inválido";
                break;
        }

        System.out.println(nomeDoDia);
        entrada.close();
    }
}
