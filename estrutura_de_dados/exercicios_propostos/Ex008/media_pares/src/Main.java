import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritimética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNumeros, quantidadeDePares = 0;
        double mediaDosPares, somatoria = 0;
        int[] numerosDigitados;
        System.out.print("Quantos elementos vai ter o vetor? ");
        quantidadeDeNumeros = entrada.nextInt();
        numerosDigitados = new int[quantidadeDeNumeros];
        for (int i = 0; i < numerosDigitados.length; i++) {
            System.out.print("Digite um numero: ");
            numerosDigitados[i] = entrada.nextInt();
            if(numerosDigitados[i] % 2 == 0){
                somatoria += numerosDigitados[i];
                quantidadeDePares ++;
            }
        }

        mediaDosPares = somatoria / quantidadeDePares;

        if (somatoria > 0){
            System.out.println("MEDIA DOS PARES = " + mediaDosPares);
        }else {
            System.out.println("NENHUM NUMERO PAR");
        }

        entrada.close();
    }
}