import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Kiki");
        lista.add("Niku");
        lista.add("Luan");
        lista.add("Samera");
        lista.add(1,"Outro gato");

        System.out.println(lista.size());

        for(String x : lista){
            System.out.println(x);
        }

        System.out.println("--------------------");

        lista.removeIf(x -> x.charAt(0) == 'O');
        for(String x : lista){
            System.out.println(x);
        }

        System.out.println("--------------------");
        System.out.println("Indice de Niku: " + lista.indexOf("Niku"));
        System.out.println("Indice de Samera: " + lista.indexOf("Samera"));
        System.out.println("--------------------");

        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());
        for (String x : resultado){
            System.out.println(x);
        }
        System.out.println("--------------------");
        String nome = lista.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
        System.out.println(nome);
    }
}