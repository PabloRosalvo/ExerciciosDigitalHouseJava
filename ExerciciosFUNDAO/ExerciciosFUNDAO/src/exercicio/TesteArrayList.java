package exercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteArrayList {
    public static void main(String[] args) {

        List<String> minhaLista = new ArrayList<String>();
        List<Integer> meusInteiros = new ArrayList<Integer>();
        List<Double> meusDoubles = new ArrayList<Double>();
        Set<String> nome = new HashSet<String>();



        // lugar aonde add string
        minhaLista.add("silvio");
        minhaLista.add("silvio2");
        minhaLista.add("silvio3");
        minhaLista.add("silvio4");
        minhaLista.add("silvio");

        System.out.println(minhaLista);

        minhaLista.remove(1);
        minhaLista.remove("silvio");
        System.out.println("depois do remove");
        System.out.println(minhaLista);
        System.out.println("--------------------------------------");
        imprimirString(minhaLista);


        meusInteiros.add(1);
        meusInteiros.add(2);

        meusInteiros.remove(1);
        imprimirInteiros(meusInteiros);




    }

    public static void imprimirString(List<String> listaParaImprimir) {

        for (String algoDaMinhaLista:listaParaImprimir) {
            System.out.println(algoDaMinhaLista);
        }
    }

    public static void imprimirInteiros(List<Integer> lista) {

        for (int algoDaMinhaLista : lista) {
            System.out.println(algoDaMinhaLista);
        }
    }


}
