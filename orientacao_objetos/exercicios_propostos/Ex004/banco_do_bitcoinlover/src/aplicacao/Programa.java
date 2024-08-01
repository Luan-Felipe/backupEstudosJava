package aplicacao;

import entidades.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entradaDoUsuario = new Scanner(System.in);
        int numeroDaConta;
        String nomeDoTitular;
        char depositoInicial;
        double valorInicial = 0.0;
        ContaBancaria contaBancaria;

        System.out.print("Entre com o numero da conta: ");
        numeroDaConta = entradaDoUsuario.nextInt();
        entradaDoUsuario.nextLine();
        System.out.print("Entre com o nome do titular: ");
        nomeDoTitular = entradaDoUsuario.nextLine();
        System.out.print("Gostaria de fazer um deposito inicial (s/n)? ");
        depositoInicial = entradaDoUsuario.next().charAt(0);

        contaBancaria = new ContaBancaria(numeroDaConta, nomeDoTitular);

        if (depositoInicial == 's') {
            System.out.print("Entre com o deposito inicial: ");
            valorInicial = entradaDoUsuario.nextDouble();
            contaBancaria = new ContaBancaria(numeroDaConta, nomeDoTitular, valorInicial);
        }

        System.out.println("Dados da conta:");
        System.out.println(contaBancaria);

        System.out.print("Entre com o valor de deposito: ");
        contaBancaria.depositar(entradaDoUsuario.nextDouble());
        System.out.println("Dados atualizados da conta:");
        System.out.println(contaBancaria);

        System.out.print("Entre com o valor de saque:");
        contaBancaria.sacar(entradaDoUsuario.nextDouble());
        System.out.println("Dados atualizados da conta:");
        System.out.println(contaBancaria);

        entradaDoUsuario.close();
    }
}