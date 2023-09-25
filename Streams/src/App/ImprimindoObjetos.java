package App;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        // Cria uma lista de strings chamada "aprovados" com alguns nomes.
        List<String> aprovados = Arrays.asList("Ana", "maria", "joao", "luiz");
        
        // 1. Usando um loop "for-each" para imprimir os elementos da lista.
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        System.out.println("\nUsando iterator");
        
        // 2. Usando um iterator para percorrer e imprimir os elementos da lista.
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("\nUsando Stream");
        
        // 3. Usando um fluxo (Stream) para imprimir os elementos da lista.
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}
