import java.util.Scanner;

//recordando a utilização do while que é uma repetição que não sabemos quantas vezes devera repetir.
public class Ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt(), soma = 0;

        while (numero != 0){
            soma += numero;
            numero = entrada.nextInt();
        }
        System.out.println("Soma dos numeros " + soma);

        entrada.close();
    }
}
