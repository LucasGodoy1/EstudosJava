// Faça um programa que leia 5 valores numéricos e guarde-os em uma lista.
// No final, mostre qual foi o maior e o menor valor digitado e as suas respectivas posições na lista.
package exercitandoalgoritimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um valor para a posição: %d\n", i);
            int valor = scanner.nextInt();
            lista.add(i, valor);
        }

        System.out.println("==============================");
        System.out.println("Valores Digitados: " + lista);


            Integer maior = null;
            Integer menor = null;


        for (int i = 0 ; i < lista.size(); i++) {
            if (i == 0){
                maior = lista.get(i);
                menor = lista.get(i);
            }else if (lista.get(i) > maior) {
                maior = lista.get(i);
            } if (lista.get(i) < menor) {
                menor = lista.get(i);
            }

        }

        System.out.printf("O maior valor digitado foi %d ", maior);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == maior){
                System.out.printf(" Posição %d ...", i);
            }
        }
        System.out.println();

        System.out.printf("O menor valor digitado foi %d", menor);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == menor){
                System.out.printf(" Posição %d ...", i);
            }
        }
        System.out.println();
        scanner.close();






    }
}
