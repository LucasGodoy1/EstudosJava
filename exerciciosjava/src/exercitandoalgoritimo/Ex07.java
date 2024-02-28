//Crie um programa que vai ler vários números e colocar em uma lista.
// Depois disso, mostre:
// A) Quantos números foram digitados.
// B) A lista de valores, ordenada de forma decrescente.
// C) Se o valor 5 foi digitado e está ou não na lista.

package exercitandoalgoritimo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaDeNumeros = new ArrayList<>();
        List<Integer> listaDeNumerosOrdenados = new ArrayList<>();
        String resposta = "";
        Integer valor = null;


        do {
            System.out.println("Digite um Valor: ");
            valor = sc.nextInt();
            listaDeNumeros.add(valor);
            System.out.println("Dseja continuar? [S/N]");
            resposta = sc.next();


        }while (!resposta.equalsIgnoreCase("N"));

        System.out.println("Você digitou: " + listaDeNumeros.size() + " elementos");

        listaDeNumerosOrdenados.addAll(listaDeNumeros
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));


        System.out.println("Os Valores em ordem decresente são: " + listaDeNumerosOrdenados);

        if (listaDeNumeros.contains(5)) {
            System.out.println("Temos o numero 5 na lista");

        }else{
            System.out.println("O valor 5 não na lista");
        }







    }
}
