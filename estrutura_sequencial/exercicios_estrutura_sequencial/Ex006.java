import java.util.Scanner;
import java.util.Locale;
public class Ex006 {
    public static void main(String[] args) {
        // Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B, C. Em seguida, calcule e mostre:
        //a) a area do triangulo retangulo que tem A por base e C por altura; b) a area do circulo de reaio C (pi = 3,14159); c) a area do trapezio que tem A e B por bases e C por altura; d) a area do quadrado que tem lado B. e) a area do retangulo que tem lados A e B.
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        triangulo = (A * C) / 2;
        circulo = 3.14159 * Math.pow(C, 2.0);
        trapezio = ((A + B) * C) / 2;
        quadrado = Math.pow(B, 2.0);
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETRANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
    }
}
