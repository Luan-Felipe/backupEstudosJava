package application;

import entities.Comentario;
import entities.Postagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comentario c1 = new Comentario("Tenha uma boa viagem !");
        Comentario c2 = new Comentario("Oloco, que legal !!");

        Postagem p1 = new Postagem(sdf.parse("15/08/2024 08:52:44"), "Viajando na maionese", "Estou vianjando na maionese", 12);
        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);

        System.out.println(p1);
    }
}