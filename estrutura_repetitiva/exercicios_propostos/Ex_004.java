import java.util.Scanner;
// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre de 1 até x. Um valor por linha, inclusive o X, se for o caso

public class Ex_004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNumeros = entrada.nextInt();

        for (int i = 1; i <= quantidadeDeNumeros; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
        entrada.close();
    }
}
