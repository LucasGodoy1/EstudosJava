//Crie um programa onde o usuário possa digitar vários valores numéricos e cadastre-os em uma lista.
// Caso o número já exista lá dentro, ele não será adicionado. No final, serão exibidos todos os valores únicos
// digitados, em ordem crescente.
package exercitandoalgoritimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        boolean respostaDoUsuario = false;
        String usuario = "";
        Integer valor = null;

        do {
            System.out.println("Digite um Valor: ");
            valor = sc.nextInt();

            if (lista.contains(valor)) {
                System.out.println("Valor duplicado, não será adicionado..");
            } else {
                lista.add(valor);
                System.out.println("Valor adicionado com sucesso!");
            }

            System.out.println("Deseja continuar? [S/N]");
            usuario = sc.next();
            if (usuario.equalsIgnoreCase("N")) {
                respostaDoUsuario = true;
            }
        } while (!respostaDoUsuario);

        System.out.println("===============================");
        System.out.println(lista);

        sc.close();
    }
}
