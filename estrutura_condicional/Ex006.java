import java.util.Scanner;

//Expressão condicional ternária: serve como um if else simplificado para decidir um valor com base em uma condição sendo ( condição ) ? valor_se_verdadeiro : valor_se_falso;
public class Ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita ai o nome de um time");
        String nome = entrada.next();
        nome = (nome.equals("Framengo") || nome.equals("framengo")) ? "Framengo porra !" : "Oloco ai não !";

        System.out.println(nome);
        System.out.println("Digita ai o preço da camiseta desse time");

        double preco = entrada.nextDouble();
        double desconto = (preco > 50) ? preco * 0.1 : preco * 0.05;
        preco -= desconto;

        System.out.printf("O preço da beca do seu time com o desconto é %.2f%n", preco);
    }
}
