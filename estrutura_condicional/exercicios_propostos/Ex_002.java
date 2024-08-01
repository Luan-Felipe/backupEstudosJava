package exercicios_propostos;

import java.util.Scanner;

public class Ex_002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println("PAR ");
        }else{
            System.out.println("IMPAR");
        }
    }
}
