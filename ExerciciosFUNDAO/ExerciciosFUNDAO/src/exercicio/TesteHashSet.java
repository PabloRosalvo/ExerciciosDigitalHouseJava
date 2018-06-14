package exercicio;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteHashSet {
    public static void main(String[] args) {
        Set<String> boletos = new HashSet<String>();


        boletos.add("joao");
        boletos.add("joao");
        boletos.add("romario gato");
        boletos.add("globo");
        boletos.add("pedro");
        boletos.add("igual");
        boletos.add("vai");

        imprimirInteiros(boletos);

    }


    public static void imprimirInteiros(Set<String> possocolocarseunome) {

        for (String algoDaMinhaLista : possocolocarseunome ) {
            System.out.println(algoDaMinhaLista);
        }
    }
}
