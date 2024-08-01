import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadePessoas, idadeDaPessoaMaisVelha = 0;
        String nomeDaPessoaMaisVelha = null;
        String[] nomeDasPessoas;
        int[] idadeDasPessoas;

        System.out.print("Quantas pessoas voce vai digitar? ");
        quantidadePessoas = entrada.nextInt();
        nomeDasPessoas = new String[quantidadePessoas];
        idadeDasPessoas = new int[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            entrada.nextLine();
            System.out.print("Nome: ");
            nomeDasPessoas[i] = entrada.nextLine();
            System.out.print("Idade: ");
            idadeDasPessoas[i] = entrada.nextInt();
        }

        for (int i = 0; i < quantidadePessoas; i++) {
            if (idadeDaPessoaMaisVelha < idadeDasPessoas[i]) {
                idadeDaPessoaMaisVelha = idadeDasPessoas[i];
                nomeDaPessoaMaisVelha = nomeDasPessoas[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA = " + nomeDaPessoaMaisVelha);
        entrada.close();
    }
}