import java.util.Scanner;

//Ler um número inteiro N e calcular os seus divisores
public class Ex_009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++)
            if (numero % i == 0) System.out.println(i);
    }
}
