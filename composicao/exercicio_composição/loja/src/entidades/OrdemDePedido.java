package entidades;

import entidades.enumeracoes.EstadoDeOrdem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemDePedido {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date momento;
    private EstadoDeOrdem estado;

    private Cliente cliente;
    private List<ItemDoPedido> itens = new ArrayList<>();

    public OrdemDePedido() {
    }

    public OrdemDePedido(Date momento, EstadoDeOrdem estado, Cliente cliente) {
        this.momento = momento;
        this.estado = estado;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public EstadoDeOrdem getEstado() {
        return estado;
    }

    public void setEstado(EstadoDeOrdem estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemDoPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemDoPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemDoPedido item) {
        itens.remove(item);
    }

    public Double total() {
        double soma = 0;

        for (ItemDoPedido i : itens) {
            soma += i.subTotal();
        }

        return soma;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Momento de abertura de ordem: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Estado da ordem: ");
        sb.append(estado + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens em ordem: \n");
        for(ItemDoPedido item : itens){
            sb.append(item + "\n");
        }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
