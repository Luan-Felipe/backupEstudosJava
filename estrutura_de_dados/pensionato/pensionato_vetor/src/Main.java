import java.util.Scanner;

/*
 A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo
*/
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] quartos = new String[10];
        String nomeDoInquilino, emailDoInquilino;
        int quantidadeDeQuartosAlugados, numeroDoQuarto;
        System.out.print("Quantos quartos serão alugados? ");
        quantidadeDeQuartosAlugados = entrada.nextInt();

        for (int i = 1; i <= quantidadeDeQuartosAlugados; i++) {
            entrada.nextLine();
            System.out.printf("Aluguel #%d%n", i);
            System.out.print("Nome: ");
            nomeDoInquilino = entrada.nextLine();
            System.out.print("Email: ");
            emailDoInquilino = entrada.nextLine();
            System.out.print("Quarto: ");
            numeroDoQuarto = entrada.nextInt();
            quartos[numeroDoQuarto] = nomeDoInquilino + ", " + emailDoInquilino;
        }

        System.out.println("Quartos ocupados: ");
        System.out.println();
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

    }
}