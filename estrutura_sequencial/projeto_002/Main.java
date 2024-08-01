public class Main {
    // processamento de dados e Java casting
    // uma boa pratica ao utilizar valores double é sempre colocar o .0 após o valor (numero de ponto flutuante com precisão dupla).
    // outra boa pratica é utilizar o f no final dos valores para indicar que o numero é um float (numero de ponto flutuante com precisão simples).

    public static void main(String[] args){
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);

        int number1, number2;
        double result;

        number1 = 5;
        number2 = 2;
        // Desta forma o compilador vai entender que a divisão de dois numeros inteiros deve retornar um numero inteiro, independente da variavel result ser double. Neste caso é necessário fazer um casting, que seria alterar o tipo explicito da expressão antes de armazena-la
        result = number1 / number2;
        System.out.println(result);
        // aqui vai o casting resultando em um numero double sem ser truncado
        result = (double) number1 / number2;
        System.out.println(result);
    }
}
