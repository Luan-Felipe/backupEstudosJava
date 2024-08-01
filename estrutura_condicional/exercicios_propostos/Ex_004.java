package exercicios_propostos;
import java.util.Scanner;
public class Ex_004 {
    public static void main(String[] args) {
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro. tendo uma duração mínima de 1 hora e máxima de 24 horas;

        Scanner entrada = new Scanner(System.in);
        int horaInicial, horaFinal, tempoDeJogo;

        System.out.println("Digite a hora inicial e final de uma partida de qualquer coisa representada por dois numeros inteiros");
        horaInicial = entrada.nextInt();
        horaFinal = entrada.nextInt();

        if (horaInicial > horaFinal){
            tempoDeJogo = (24 - horaInicial) + horaFinal;
        } else if (horaFinal > horaInicial) {
            tempoDeJogo = horaFinal - horaInicial;
        } else{
            tempoDeJogo = 24;
        }

        if (tempoDeJogo >= 1 && tempoDeJogo <= 24){
            System.out.printf("O JOGO DUROU %d HORA(S)",tempoDeJogo);
        }else{
            System.out.println("Tempo de jogo invalido");
        }
        entrada.close();
    }
}
