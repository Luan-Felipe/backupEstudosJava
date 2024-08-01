package application;
import entities.Produto;

import java.util.Scanner;
import java.util.Locale;

//Ler um valor digitado pelo usuario que determina a quantidade de produtos que serão cadastrados no sistema. Em seguida ler a quantidade de produtos (nome e preço) que foi informada. Por ultimo digitar a media de preço dos produtos digitados.
public class Aplicativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos que serão adicionados ao sistema");
        int quantidadeDeProdutos = entrada.nextInt();
        Produto[] produtos = new Produto[quantidadeDeProdutos];

        System.out.println("Agora digite o nome e preço dos produtos");
        for (int i = 0; i < produtos.length; i++){
            entrada.nextLine();
            System.out.printf("Produto numero " + (i + 1) + "%n");
            String nomeDoProduto = entrada.nextLine();
            double precoDoProduto = entrada.nextDouble();
            produtos[i] = new Produto(nomeDoProduto, precoDoProduto);
        }

        double soma = 0.0;

        for (int i = 0; i < produtos.length; i++){
            soma += produtos[i].getPreco();
        }

        double mediaDePreco = soma / produtos.length;

        System.out.printf("A Media de preços dos %d produtos é: %.2f", produtos.length, mediaDePreco);
        entrada.close();
    }
}