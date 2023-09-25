package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        // Definindo duas funções de consumo para imprimir na tela
        Consumer<String> printa = System.out::print; // Imprime strings sem quebra de linha
        Consumer<Integer> printaln = System.out::println; // Imprime inteiros com quebra de linha

        // Criando um Stream de Strings usando o método "of" e imprimindo suas elementos
        Stream<String> linguagens = Stream.of("Java ", "Python ", "JS ", "C#\n");
        linguagens.forEach(printa);

        // Criando um array de Strings e transformando-o em um Stream
        String[] maisLinguagens = {"C++ ", "Lisp ", "Perl ", "Go\n"};
        Stream.of(maisLinguagens).forEach(printa);

        // Criando um Stream a partir de um subarray e imprimindo seus elementos
        Arrays.stream(maisLinguagens).forEach(printa);
        Arrays.stream(maisLinguagens, 1, 3).forEach(printa);

        // Criando uma lista de Strings e transformando-a em um Stream
        List<String> outrasLinguagens = Arrays.asList("\nC+ ", "PHP ", "Kotlin ", "Ruby ");
        outrasLinguagens.stream().forEach(printa);

        System.out.println("\n-----");

        // Criando um Stream paralelo a partir da lista e imprimindo seus elementos (paralelamente)
        outrasLinguagens.parallelStream().forEach(printa);

        // Gerando um Stream infinito de "A" e imprimindo seus elementos
       // Stream.generate(() -> "A").forEach(printa);

        // Gerando um Stream infinito de inteiros começando em 0 e imprimindo-os
       // Stream.iterate(0, n -> n + 1).forEach(printaln);
    }
}
