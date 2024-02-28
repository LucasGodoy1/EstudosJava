//Crie um programa onde o usuário possa digitar cinco valores numéricos e cadastre-os em uma lista,
// já na posição correta de inserção (sem usar o sorted. No final, mostre a lista ordenada na tela.
package exercitandoalgoritimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        // Digite os cinco valores
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor: ");
            int valor = sc.nextInt();

            // Se a lista estiver vazia ou se o valor for maior que o último elemento da lista
            if (lista.isEmpty() || valor > lista.get(lista.size() - 1)) {
                lista.add(valor);
            } else {
                // Percorre a lista para encontrar a posição correta de inserção
                int j = 0;
                while (j < lista.size() && valor > lista.get(j)) {
                    j++;
                }
                lista.add(j, valor);
            }
        }


        System.out.println("============================");
        System.out.println("Os Valores digitados são: " + lista);

        sc.close();
    }
}