import java.util.Scanner;

public class Ex_001 {
    //Excreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o allgoritimo encerrado. Considere que a senha correta é o valor 2002.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha = entrada.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = entrada.nextInt();
        }

        System.out.println("Acesso Permitido");
        entrada.close();
    }
}
