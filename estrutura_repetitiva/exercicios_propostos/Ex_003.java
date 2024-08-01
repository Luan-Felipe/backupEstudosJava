import java.util.Scanner;

//Um posto de combustiveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritimo para ler um tipo de combustivel abastecido (codificado da seguinte forma. 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4), deve ser solicitado um novo código (até que seja valido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abastecem cada tipo de combustível.

public class Ex_003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo = 0;
        int alcool = 0, gasolina = 0, diesel = 0;

        while(codigo != 4){
            codigo = entrada.nextInt();
            switch (codigo){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    System.out.println("Codigo inválido, tente novamente !");
                    break;
            }
        }

        System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
        entrada.close();
    }
}
