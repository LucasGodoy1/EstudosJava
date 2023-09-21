package App;

import entidade.Calculo;

public class Programa2 {

    public static void main(String[] args) {
        // Cria uma instância da interface Calculo usando uma expressão lambda
        Calculo calc = (x, y) -> {
            // Implementação da soma de dois números
            return x + y;
        };

        // Executa a operação de soma e imprime o resultado
        System.out.println(calc.executar(10, 5));

        // Reatribui a variável calc com uma nova expressão lambda
        calc = (x, y) -> {
            // Implementação da multiplicação de dois números
            return x * y;
        };

        // Executa a operação de multiplicação e imprime o resultado
        System.out.println(calc.executar(10, 5));
        
        System.out.println(calc.teste());
        System.out.println(Calculo.teste2());
        
        
        
    }
    


}
