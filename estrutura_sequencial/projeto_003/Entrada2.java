import java.util.Scanner;

// Entrada de dados de uma string sem espaços é next(), entrada de dados até a quebra de linha é nextLine();
// A leitura de qualquer leitura antes do nextLine() que não ele mesmo deixa pendente uma quebra de linha consumindo a atribuição da proxima leitura, sendo necessário assim um input extra de nextLine() pra consumir a quebra de linha anterior.
public class Entrada2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String string1, string2, string3;

        numero = sc.nextInt();
        sc.nextLine();
        string1 = sc.nextLine();
        string2 = sc.nextLine();
        string3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println("numero = " + numero);
        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
    }
}
