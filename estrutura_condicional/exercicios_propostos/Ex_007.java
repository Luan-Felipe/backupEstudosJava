package exercicios_propostos;
import java.util.Locale;
import java.util.Scanner;

// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem "Origem". Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", conforme for a situação.
public class Ex_007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double x, y;
        System.out.println("Digite os valores para coordenadas x e y");

        x = entrada.nextDouble();
        y = entrada.nextDouble();

        if (!(x == 0.0) && y == 0.0){
            System.out.println("Eixo X");
        }else if (!(y == 0.0) && x == 0.0){
            System.out.println("Eixo Y");
        }else if(x > 0.0 && y > 0.0){
            System.out.println("Q1");
        }else if(x < 0.0 && y > 0.0){
            System.out.println("Q2");
        }else if(x < 0.0 && y < 0.0){
            System.out.println("Q3");
        }else if(x > 0.0 && y < 0.0){
            System.out.println("Q4");
        }else {
            System.out.println("Origem");
        }

        entrada.close();
    }
}
