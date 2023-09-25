package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {
        // Definindo duas funções de consumo para imprimir na tela
        Consumer<String> printa = System.out::print; // Imprime strings sem quebra de linha
        Consumer<String> printaln = System.out::println; // Imprime strings com quebra de linha

        // Criando uma lista de marcas de carros
        List<String> marcas = Arrays.asList("BMW ", "AUDI ", "Honda \n");

        // Usando o método map para transformar todas as marcas em letras maiúsculas e imprimi-las
        marcas.stream().map(m -> m.toUpperCase()).forEach(printa);

        // Definindo três operadores unários para transformações
        UnaryOperator<String> maiusculo = n -> n.toUpperCase(); // Converte para maiúsculas
        UnaryOperator<String> primeiraLetra = n -> n.substring(0, 1); // Pega a primeira letra
        UnaryOperator<String> grito = n -> n + " !!! "; // Adiciona " !!! " ao final

        // Imprimindo uma mensagem de separação
        System.out.println("\nUSANDO COMPOSIÇÃO");

        // Usando composição de operadores para aplicar múltiplas transformações em cada marca
        marcas.stream()
            .map(maiusculo) // Converte para maiúsculas
            .map(primeiraLetra) // Pega a primeira letra
            .map(grito) // Adiciona " !!! " ao final
            .forEach(printa); // Imprime o resultado
    }
}
