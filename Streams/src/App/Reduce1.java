package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {
        // Cria uma lista de números inteiros de 1 a 10.
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Define uma operação de redução para somar dois números inteiros.
        BinaryOperator<Integer> soma = (ac, y) -> ac + y;

        // Realiza uma redução na lista de números, somando-os sequencialmente.
        int total = nums
                .stream()
                .reduce(soma)
                .get();
        
        // Imprime o resultado da soma sequencial.
        System.out.println(total);

        // Realiza uma redução na lista de números, somando-os sequencialmente,
        // começando com o valor inicial de 100, e depois ele irá apenas acumular e somar
        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(total2);

        // Realiza uma redução paralela na lista de números, somando-os,
        // começando com o valor inicial de 100, para cara indice da lista fara 100 + o numero.
        total2 = nums.parallelStream().reduce(100, soma);
        System.out.println(total2);

        // Filtra os números na lista que são maiores que 5 e realiza uma redução
        // sequencial na lista resultante, somando-os.
        nums.stream()
            .filter(n -> n > 5)
            .reduce(soma)
            .ifPresent(System.out::println); // Se o resultado estiver presente, faça um print.
    }
}
