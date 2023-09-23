package App;

import java.util.function.BiFunction;

public class Programa6 {

    public static void main(String[] args) {
        // Criando uma expressão lambda que recebe dois números (n1 e n2) e retorna uma String.
        BiFunction<Double, Double, String> status =
                (n1, n2) -> ((n1 + n2) / 2) + " Media";

        // Calcula a média de 10.0 e 10.0 e concatena " Media" para formar a String.
        System.out.println(status.apply(10.0, 10.0));

        // Atualiza a expressão lambda para verificar se a média é maior ou igual a 7.
        status = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";

        // Calcula a média de 10.0 e 10.0 e retorna "Aprovado" porque a média é maior ou igual a 7.
        System.out.println(status.apply(10.0, 10.0));
        
        // Nova expressão lambda que calcula a média e aprovado/reprovado, com comentários adicionados.
        status = (n1, n2) -> {
            double media = (n1 + n2) / 2;
            String resultado = media >= 7 ? "Aprovado" : "Reprovado";
            return "Sua média: " + media + "  " + resultado;
        };
        
        // Imprime o resultado da nova expressão lambda
        System.out.println(status.apply(10.0, 10.0));
    }
}
