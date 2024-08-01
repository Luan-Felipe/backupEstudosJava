package entities;

public class Funcionario {
    private final Integer identificador;
    private String nome;
    private Double salario;

    public Funcionario(Integer identificador, String nome, Double salario) {
        this.identificador = identificador;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentoDeSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);
    }

    public String toString(){
        return identificador + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
