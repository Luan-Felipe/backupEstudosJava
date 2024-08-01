package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
    (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
    ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
    para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
    resolver este problema.
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userEnter = new Scanner(System.in);
        Student student = new Student();

        student.name = userEnter.nextLine();
        student.firstQuarterGrade = userEnter.nextDouble();
        student.secondQuarterGrade = userEnter.nextDouble();
        student.thirdQuarterGrade = userEnter.nextDouble();
        student.isApproved();

        System.out.println(student);

        userEnter.close();
    }
}