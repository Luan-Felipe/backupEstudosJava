package entities;

import entities.enums.NivelDoTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelDoTrabalhador nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoDeHoras> contratosDoTrabalhador = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDoTrabalhador getLevel() {
        return nivel;
    }

    public void setNivel(NivelDoTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public NivelDoTrabalhador getNivel() {
        return nivel;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoDeHoras> getContratosDoTrabalhador() {
        return contratosDoTrabalhador;
    }

    public void adicionarContrato(ContratoDeHoras contrato) {
        contratosDoTrabalhador.add(contrato);
    }

    public void removerContrato(ContratoDeHoras contrato) {
        contratosDoTrabalhador.remove(contrato);
    }

    public Double salarioTotalDoMes(Integer ano, Integer mes) {
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
        for (ContratoDeHoras c : contratosDoTrabalhador) {
            calendario.setTime(c.getData());
            int c_ano = calendario.get(Calendar.YEAR);
            int c_mes = calendario.get(Calendar.MONTH) + 1;
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
