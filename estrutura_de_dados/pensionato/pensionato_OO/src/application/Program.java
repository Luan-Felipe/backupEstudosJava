package application;

import entities.Inquilino;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] quartos = new String[10];
        Inquilino inquilino;
        String nomeInquilino, emailInquilino;
        int quartoDesejado;

        System.out.print("Quantos quartos serão alugados? ");
        int quantidadeDeQuartosParaAlugar = entrada.nextInt();

        for (int i = 0; i < quantidadeDeQuartosParaAlugar; i++) {
            entrada.nextLine();
            System.out.println("Alugel #" + (i + 1));
            System.out.print("Nome: ");
            nomeInquilino = entrada.nextLine();
            System.out.print("Email: ");
            emailInquilino = entrada.nextLine();
            inquilino = new Inquilino(nomeInquilino, emailInquilino);
            System.out.print("Quarto: ");
            quartoDesejado = entrada.nextInt();
            quartos[quartoDesejado] = quartoDesejado + inquilino.toString();
        }

        for (int i = 0; i < quartos.length; i++) {
            if(quartos[i] != null){
                System.out.println(quartos[i]);
            }
        }
    }
}