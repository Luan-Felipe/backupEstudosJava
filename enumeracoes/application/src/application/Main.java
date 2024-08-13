package application;

import entities.Pedido;
import entities.enums.StatusDoPedido;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1, new Date(), StatusDoPedido.PAGAMENTO_PENDENTE);

        Pedido pedido2 = new Pedido(2, new Date(), StatusDoPedido.ENVIADO);
        Pedido pedido3 = new Pedido(3, new Date(), StatusDoPedido.valueOf("ENVIADO"));

        System.out.println("pedido1 = " + pedido1);
        System.out.println("pedido2 = " + pedido2);
        System.out.println("pedido3 = " + pedido3);
    }
}