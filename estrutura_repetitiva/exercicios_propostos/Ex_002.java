import java.util.Scanner;

//Escreva um programa para ler as coordenadas (x, y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritimo será encerrado quando pelo menos uma de duas coodernadas for Nula (nesta situação sem escrever mensagem alguma).
public class Ex_002 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int x = entrada.nextInt();
         int y = entrada.nextInt();

         while (x != 0 && y != 0){
             if(x > 0 && y > 0){
                 System.out.println("primeiro");
             }else if(x < 0 && y > 0){
                 System.out.println("segundo");
             }else if(x < 0 && y < 0){
                 System.out.println("terceiro");
             }else if(x > 0 && y < 0){
                 System.out.println("quarto");
             }
             x = entrada.nextInt();
             y = entrada.nextInt();
         }
         entrada.close();
    }
}
