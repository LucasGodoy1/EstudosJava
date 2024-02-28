//faça um programa que informe os relacionamentos de ordem existentes entre dois numeros

package exercitandoalgoritimo;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 numeros para comparar: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        System.out.println(numero1 + " = " + numero2 + " ? " + (numero1 == numero2));
        System.out.println(numero1 + " != " + numero2 + " ? " + (numero1 != numero2));
        System.out.println(numero1 + " > " + numero2 + " ? " + (numero1 > numero2));
        System.out.println(numero1 + " < " + numero2 + " ? " + (numero1 < numero2));
        System.out.println(numero1 + " >= " + numero2 + " ? " + (numero1 >= numero2));
        System.out.println(numero1 + " <= " + numero2 + " ? " + (numero1 <= numero2));

        sc.close();

        }



    }

