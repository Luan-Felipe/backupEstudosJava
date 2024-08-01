import java.util.Scanner;

// Fazer um programa para ler um numero N. Despois N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero. mostrar a mensagem "divisão impossivel".
public class Ex_007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDePares = entrada.nextInt();

        for(int i = 0; i < quantidadeDePares; i++){
            int denominador = entrada.nextInt();
            int divisor = entrada.nextInt();
            double quociente = 0.0;
            if(divisor == 0){
                System.out.println("divisao impossivel");
            }else{
                quociente =(double)  denominador / divisor;
                System.out.printf("%.1f%n", quociente);
            }
        }

        entrada.close();
    }
}
