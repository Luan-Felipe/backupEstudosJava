package exercicios_propostos;
import java.util.Scanner;

//Leia 2 valores inteiros. Após, o programa deve mostrar uma mensagem "São Multiplos", indicando se os valores lidos são multiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
public class Ex_003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite dois numeros inteiros na mesma linha, separados por um espaço simples.");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        if(numero1 > numero2){
            if(numero1 % numero2 == 0){
                System.out.println("São Multiplos");
            }else{
                System.out.println("Não são Multiplos");
            }
        }else{
            if(numero2 % numero1 == 0){
                System.out.println("São Multiplos");
            }else{
                System.out.println("Não são Multiplos");
            }
        }
        entrada.close();
    }
}
