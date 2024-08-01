package application;

import entities.Funcionario;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeRegistros;
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        System.out.print("Quantos funcionários serão registrados? ");
        quantidadeDeRegistros = entrada.nextInt();
        String nome;
        int id;
        double salario;

        for (int i = 0; i < quantidadeDeRegistros; i++) {
            System.out.println("Funcionario #" + (i + 1));
            System.out.print("Id: ");
            id = entrada.nextInt();
            while (existeId(funcionarios, id)) {
                System.out.print("O identificador ja existe, tente novamente: ");
                id = entrada.nextInt();
            }
            System.out.print("Nome: ");
            entrada.nextLine();
            nome = entrada.nextLine();
            System.out.print("Salario: ");
            salario = entrada.nextDouble();
            funcionarios.add(new Funcionario(id, nome, salario));
            System.out.println();
        }

        double porcentagem;
        System.out.print("Entre com o identificador do funcionário que terá o sálario aumentado: ");
        int idBuscado = entrada.nextInt();
        Funcionario funcionarioProcurado = funcionarios.stream().filter(x -> x.getIdentificador() == idBuscado).findFirst().orElse(null);

        if (funcionarioProcurado == null) {
            System.out.println("Funcionário não existe");
            System.out.println();
        } else {
            System.out.print("Entre com a porcentagem: ");
            porcentagem = entrada.nextDouble();
            funcionarioProcurado.aumentoDeSalario(porcentagem);
            System.out.println();
        }

        System.out.println("Lista de funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        entrada.close();
    }

    public static boolean existeId(List<Funcionario> lista, int id) {
        Funcionario funcionarioProcurado = lista.stream().filter(x -> x.getIdentificador() == id).findFirst().orElse(null);
        return funcionarioProcurado != null;
    }
}