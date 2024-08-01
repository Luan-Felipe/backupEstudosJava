import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = entrada.nextDouble();
        double desconto = (valor < 91) ? desconto = valor * 0.1 : 0.0;
        valor -= desconto;
        System.out.println(valor);
    }
}
