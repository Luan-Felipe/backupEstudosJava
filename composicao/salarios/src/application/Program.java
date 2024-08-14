package application;

import entities.ContratoDeHoras;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelDoTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com o nome do departamento: ");
        String nomeDoDepartamento = entrada.nextLine();
        System.out.println("Agora entre com os dados do trabalhador:");
        System.out.print("Nome: ");
        String nomeDoFuncionario = entrada.nextLine();
        System.out.print("NivelDoTrabalhador: ");
        String nivelDoTrabalhador = entrada.nextLine();
        System.out.print("Salario Base: ");
        double salarioBase = entrada.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeDoFuncionario, NivelDoTrabalhador.valueOf(nivelDoTrabalhador), salarioBase, new Departamento(nomeDoDepartamento));

        System.out.print("Quantos contratos esse trabalhador terá?");
        int quantidadeDeContratos = entrada.nextInt();

        for (int i = 0; i < quantidadeDeContratos; i++) {
            System.out.println("Entre com os dados do " + (i + 1) + "# contrato");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataDoContrato = formatador.parse(entrada.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = entrada.nextDouble();
            System.out.print("Duração em (horas): ");
            int duracaoEmHoras = entrada.nextInt();
            ContratoDeHoras contratoDigitado = new ContratoDeHoras(dataDoContrato, valorPorHora, duracaoEmHoras);
            trabalhador.adicionarContrato(contratoDigitado);
        }

        System.out.println();
        entrada.nextLine();
        System.out.print("Agora entre com o mes e ano para calcular a renda mensal especifica (MM/YYYY): ");
        String mesEAno = entrada.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        double rendaDoMes = trabalhador.salarioTotalDoMes(ano, mes);
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda para " + mesEAno + ": " + String.format("%.2f", rendaDoMes));

        entrada.close();
    }
}