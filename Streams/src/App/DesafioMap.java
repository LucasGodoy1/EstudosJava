package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {
        // Cria uma lista de inteiros chamada "nums" com os valores de 1 a 9.
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        // Cria um consumidor (função que consome elementos) que imprime objetos no console.
        Consumer<Object> printa = System.out::print;
        
        // Cria uma função (UnaryOperator) chamada "inverter" que inverte uma string.
        UnaryOperator<String> inverter =
            i -> new StringBuilder(i).reverse().toString();
        
        // Cria uma função (Function) chamada "binarioParaInt" que converte uma string binária em um inteiro.
        Function<String, Integer> binarioParaInt = 
            s -> Integer.parseInt(s, 2);
        
        // Inicia uma stream com os elementos da lista "nums".
		nums.stream()
		.map(l-> l.toBinaryString(l))
		.map(inverter).map(binarioParaInt).forEach(printa);
		

	}

}
