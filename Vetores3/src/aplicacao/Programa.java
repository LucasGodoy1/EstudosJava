package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos Numeros deseja digitar ?");
		int n = sc.nextInt();
		int[] lista = new int [n];
		for (int i  = 0 ; i < n ; i ++) {
			System.out.println("Digite um numero ");
			lista[i] = sc.nextInt();
		}
		int pares = 0;
		System.out.println("Numeros pares");
		for (int item : lista) {
			if (item % 2 ==0) {
				pares ++;
				System.out.println(item);
			}
		}
		System.out.println("Quantidade de pares: " + pares);
		
		
		
		
		
		
		
		

	}

}
