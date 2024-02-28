//escreba um programa que leia a idade em anos e imprimaa em dias
package exercitandoalgoritimo;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos anos voce tem? ");
        int idade = sc.nextInt();
        System.out.println("Sua idade em dias: " + (idade * 365));

        sc.close();

    }
}
