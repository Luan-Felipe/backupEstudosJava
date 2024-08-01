import java.util.Scanner;
public class Funcao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 numeros na mesma  linha dividido por espaço para descobrir qual numero é maior");

        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();

        int maiorNumero = maior(numero1, numero2, numero3);
        mostrarResultado(maiorNumero);

    }

    public static int maior(int n1, int n2, int n3){
        int maior;
        if(n1 > n2 && n1 > n3) maior = n1;
        else maior = n2 > n3 ? n2 : n3;

        return maior;
    }

    public static void mostrarResultado(int resultado){
        System.out.println("Resultado: " + resultado);
    }
}
