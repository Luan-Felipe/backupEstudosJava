package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade, numeroDePessoas;
        double altura;

        System.out.print("Quantas pessoas serao digitadas ?");
        numeroDePessoas = entrada.nextInt();
        Pessoa[] pessoas = new Pessoa[numeroDePessoas];

        for (int i = 0; i < pessoas.length; i++) {
            entrada.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            nome = entrada.nextLine();
            System.out.print("Idade: ");
            idade = entrada.nextInt();
            System.out.print("Altura: ");
            altura = entrada.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double alturaMedia = 0.0, percentagemDezesseis = 0.0;
        int pessoasComMenosQueDezesseis = 0;

        for (int i = 0; i < pessoas.length; i++) {
            alturaMedia += pessoas[i].getAltura();

            if (pessoas[i].getIdade() < 16){
                pessoasComMenosQueDezesseis ++;
            }
        }
        percentagemDezesseis =(double) pessoasComMenosQueDezesseis * 100 / pessoas.length;
        System.out.printf("Altura média: %.2f%n", alturaMedia / pessoas.length);
        System.out.printf("Pessoas com mesnos de 16 anos: %.1f%%\n", percentagemDezesseis);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }
    }
}