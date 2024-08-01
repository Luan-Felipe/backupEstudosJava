import java.util.Locale;
import java.util.Scanner;

//Entrada de dados atraves do teclado uso de scanner; Para printar valores com atalhos utilizar sout para System.out... Para printar o nome da classe e metodo soutm; Para printar o metodo e o valor soutp; para printar o valor das variaveis com indicação soutv
// Para abreviar o codigo public static vou main... utilizar psvm(OH MY GOD);
// O sc.nextDouble usa a localidade do sistema, o que quer dizer que se o sistema for portugues brasileiro o double digitado precisa estar escrito com , ao inves de . , caso queira utilizar . precisa usar o comando Locale.setDefault(Locale.US) antes de instanciar o scanner;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String texto;
        int numeroInteiro;
        double numeroDecimal;
        char caractere;
        System.out.println("Digite um texto sem espaços");
        texto = sc.next();
        System.out.println("Digite um numero inteiro");
        numeroInteiro = sc.nextInt();
        System.out.println("Digite um numero decimal");
        numeroDecimal = sc.nextDouble();
        System.out.println("Digite um caractere");;
        caractere = sc.next().charAt(0);
        System.out.println("Voce digitou = " + texto);
        System.out.println("O numero que voce digitou foi = " + numeroInteiro);
        System.out.println("O numero decimal que voce digitou foi = " + numeroDecimal);
        System.out.println("O caractere que voce digitou foi = " + caractere);
        sc.close();
    }
}
