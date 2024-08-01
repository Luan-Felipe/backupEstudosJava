package entidades;

public class ContaBancaria {
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldoDaConta;

    public ContaBancaria(int numeroDaConta,String nomeDoTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    public ContaBancaria(int numeroDaConta,String nomeDoTitular, double depositoInicial){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        depositar(depositoInicial);
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public void setNomeDoTitular(String nomeDoTitular){
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNomeDoTitular(){
        return nomeDoTitular;
    }

    public void depositar(double deposito){
        saldoDaConta += deposito;
    }

    public void sacar(double saque){
        double taxaDeSaque = 5.00;
        saldoDaConta -= saque + taxaDeSaque;
    }

    public double getSaldoDaConta(){
        return saldoDaConta;
    }

    public String toString(){
        return "Conta " +
                getNumeroDaConta() +
                ", Titular: " +
                getNomeDoTitular() +
                String.format(", Saldo: $ %.2f%n", getSaldoDaConta());
    }
}
