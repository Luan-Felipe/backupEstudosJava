import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int[][] matriz = new int[n][n];
        int numerosNegativos = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Diagonal Principal");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    System.out.print(matriz[i][j] + " ");
                }
                if(matriz[i][j] < 0){
                    numerosNegativos++;
                }
            }
        }
        System.out.println();
        System.out.println("Numeros Negativos = " + numerosNegativos);
    }
}