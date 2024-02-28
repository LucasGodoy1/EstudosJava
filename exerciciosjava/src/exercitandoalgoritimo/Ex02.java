//faça um programa que imprima a tabuada
package exercitandoalgoritimo;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tabuada deseja ver? ");
        int taboada = sc.nextInt();

        System.out.println("====Taboada====");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", i, taboada, i*taboada);

        }


        sc.close();

    }
}
