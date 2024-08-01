import java.util.Scanner;
//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalor [10,20] e quantos estão fora do intervalo. Mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo e "out" para fora do intervalo)

public class Ex_005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNumeros = entrada.nextInt(), in = 0, out = 0;

        for(int i = 0; i < quantidadeDeNumeros; i++){
            int numero = entrada.nextInt();

            if (numero >= 10 && numero <= 20){
                in ++;
            }else{
                out++;
            }
        }

        System.out.printf("%d in%n%d out", in, out);
        entrada.close();
    }
}
