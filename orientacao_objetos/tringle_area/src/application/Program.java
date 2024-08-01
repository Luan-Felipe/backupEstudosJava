package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of tringle X");
        x.sideA = sc.nextDouble();
        x.sideB = sc.nextDouble();
        x.sideC = sc.nextDouble();
        System.out.println("Enter the measures of tringle Y");
        y.sideA = sc.nextDouble();
        y.sideB = sc.nextDouble();
        y.sideC = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area of triangle X is: %.4f%n", areaX);
        System.out.printf("Area of triangle Y is: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}