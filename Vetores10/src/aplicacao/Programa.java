package aplicacao;

import java.util.Scanner;

import entidade.Locacao;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locacao[] lista = new Locacao[10];
        System.out.println("Quantos Quartos serao reservados? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("E-mail: ");
            String email = sc.nextLine();
            System.out.println("Numero de quarto: ");
            int quarto = sc.nextInt();
            Locacao locador = new Locacao(nome, email);
            lista[quarto - 1] = locador; 
        }
        System.out.println("-----------------");
        System.out.println("Quartos Reservados");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println("Quarto " + (i + 1) + ": " + lista[i]);
            }
        }
    }
}
