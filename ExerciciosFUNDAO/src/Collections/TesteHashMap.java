package Collections;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {

    public static void main(String[] args) {

        // Criação do HashMap
        Map<Integer, String> meuHashMap = new HashMap<Integer, String>();

        // Add elementos no HashMaps
        meuHashMap.put(1, "AA");
        meuHashMap.put(2, "BB");
        meuHashMap.put(3, "CC");
        meuHashMap.put(4, "DD");

        // Mostrando Elementos
        System.out.println("HashMap contem: "+ meuHashMap);


        /* DICA!
         * O método "keySet()" retorna um Set com todas as chaves do
         * nosso HashMap, e tendo o Set com todas as Chaves,
         * podemos facilmente pegar
         * os valores que desejamos
         * */

        for (int key : meuHashMap.keySet()) {
            //Capturamos o valor a partir da chave
            String value = meuHashMap.get(key);
            System.out.println(key + " = " + value);
        }


        // OUTRO EXEMPLO de Varrer um Map S2

        /* DICA!
         * entry() Retorna um conjunto de Maps contido no mapa configurado,
         * podendo ser possível acessar suas chaves e valores.
         **/


        for (Map.Entry<Integer,String> entry : meuHashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Chave :"+ key);
            System.out.println("Valor :"+ value);

        }
    }
}
