package aplicacao;

import entidades.Cliente;
import entidades.ItemDoPedido;
import entidades.OrdemDePedido;
import entidades.Produto;
import entidades.enumeracoes.EstadoDeOrdem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nomeDoCliente = entrada.nextLine();
        System.out.print("Email: ");
        String emailDoCliente = entrada.next();
        System.out.print("Data de nascimento: ");
        Date dataDeNascimento = sdf.parse(entrada.next());

        Cliente cliente = new Cliente(nomeDoCliente, emailDoCliente, dataDeNascimento);

        System.out.println("Entre com o estado da ordem:");
        System.out.print("Estado: ");
        EstadoDeOrdem estado = EstadoDeOrdem.valueOf(entrada.next());

        OrdemDePedido ordem = new OrdemDePedido(new Date(), estado, cliente);

        System.out.print("Quantos itens serão adicionados a esta ordem ? ");
        int quantidadeDeItens = entrada.nextInt();

        for (int i = 0; i < quantidadeDeItens; i++) {
            System.out.println("Entre com aos dados do item " + (i + 1) + "#");
            System.out.print("Nome do produto: ");
            entrada.nextLine();
            String nomeDoProduto = entrada.nextLine();
            System.out.print("Preco: ");
            Double precoDoProduto = entrada.nextDouble();

            Produto produto = new Produto(nomeDoProduto, precoDoProduto);

            System.out.print("Quantidade: ");
            Integer quantidade = entrada.nextInt();

            ItemDoPedido itemDoPedido = new ItemDoPedido(quantidade, precoDoProduto, produto);

            ordem.adicionarItem(itemDoPedido);
        }

        System.out.println();
        System.out.println("Resumo do Pedido: ");
        System.out.println(ordem);
        entrada.close();
    }
}