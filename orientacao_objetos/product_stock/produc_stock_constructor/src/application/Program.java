package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product2 = new Product(); //inicialização do construtor padrão
        Product product3 = new Product("Tamagoshi", 10.00); //inicialização do construtor com dois atributos setados. quantity ficara em 0 por enquanto.
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        //Com essas duas linhas a baixo eu altera nome e preço do produto independente do que foi digitado antes.
        product.setName("Computer");
        product.setPrice(2000.00);

        System.out.printf("Updated with get and set: " + product.getName() + ", $ "+ String.format("%.2f", product.getPrice()) + ", " + product.getQuantity() + " units, Total: $ " + String.format("%.2f%n", product.totalValueInStock()));

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}