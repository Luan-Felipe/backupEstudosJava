package exercicios_propostos;
import java.util.Scanner;
import java.util.Locale;
//Escreva um programa que leia o codigo de um item e a quantidade deste item. A seguir, calcule o valor da conta a pagar.
public class Ex_005 {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner entrada = new Scanner(System.in);

       int codigo, quantidadeDoItem;
       double total = 0;
        System.out.println("Digite o codigo do produto em numero natural e em seguida a quantidade do produto");
        codigo = entrada.nextInt();
        quantidadeDoItem = entrada.nextInt();

        if (codigo == 1){
            total = quantidadeDoItem * 4.00;
        } else if (codigo == 2) {
            total = quantidadeDoItem * 4.50;
        } else if (codigo == 3){
            total = quantidadeDoItem * 5.00;
        } else if (codigo == 4) {
            total = quantidadeDoItem * 2.00;
        } else if (codigo == 5) {
            total = quantidadeDoItem * 1.50;
        }else{
            System.out.println("Código digitado inválido");
        }

        System.out.printf("Total: R$ %.2f", total);
    }
}
