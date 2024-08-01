package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
    seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
    salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
    afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
    projetada no documento PDF.
*/
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userEnter = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = userEnter.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = userEnter.nextDouble();
        System.out.print("Tax: ");
        employee.tax = userEnter.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = userEnter.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);
    }
}