package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler os valores da largura e altura
    de um retângulo. Em seguida, mostrar na tela o valor de
    sua área, perímetro e diagonal. Usar uma classe como
    mostrado no projeto no documento.
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userEnter = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = userEnter.nextDouble();
        rectangle.height = userEnter.nextDouble();
        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        userEnter.close();

    }
}