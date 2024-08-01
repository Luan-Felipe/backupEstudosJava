import java.util.Scanner;

/*
 Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.
*/
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroDeLinhas, numeroDeColunas, numeroProcurado;

        System.out.println("Digite o numero de linhas que terá a matriz");
        numeroDeLinhas = entrada.nextInt();
        System.out.println("Digite o numero de colunas que terá a matriz");
        numeroDeColunas = entrada.nextInt();

        int[][] matriz = new int[numeroDeLinhas][numeroDeColunas];

        for (int i = 0; i < numeroDeLinhas; i++) {
            for (int j = 0; j < numeroDeColunas; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Digite o numero que voce procura na matriz");
        numeroProcurado = entrada.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroProcurado) {
                    System.out.printf("Posição %d,%d:%n", i, j);
                    if (j > 0) {
                        System.out.printf("Esquerda: %d%n", matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.printf("Acima: %d%n", matriz[i-1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.printf("Direita: %d%n", matriz[i][j+1]);
                    }
                    if (i < matriz.length - 1){
                        System.out.printf("Abaixo: %d%n", matriz[i+1][j]);
                    }
                }
            }
        }
        entrada.close();
    }
}
