package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos Numeros deseja digitar ?");
		int n = sc.nextInt();
		int[] listaA = new int[n];
		int[] listaB = new int[n];
		int[] listaC = new int[n];
		for (int i = 0 ; i < n ; i ++) {
			System.out.println("Digite um numero Lista A: ");
			listaA[i] = sc.nextInt();
		}
		for (int i = 0 ; i < n ; i ++) {
			System.out.println("Digite um numero Lista B: ");
			listaB[i] = sc.nextInt();
		}

		for (int i = 0 ; i < n ; i ++) {
			System.out.println("Lista C: ");
			listaC[i] =  listaA[i] + listaB[i];
		}
		for (int numero : listaC) {
			System.out.println("Valores Resultantes: " + numero);
		}
		
		
		
		
		
		
		
		
		

	}

}
