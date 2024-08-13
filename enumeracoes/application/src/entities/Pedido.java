package entities;

import entities.enums.StatusDoPedido;

import java.util.Date;

public class Pedido {
    private Integer identificador;
    private Date momento;
    private StatusDoPedido status;

    public Pedido(Integer identificador, Date momento, StatusDoPedido status){
        this.identificador = identificador;
        this.momento = momento;
        this.status = status;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "identificador=" + identificador +
                ", momento=" + momento +
                ", status=" + status +
                '}';
    }
}
