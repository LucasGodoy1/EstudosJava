package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos Numeros deseja digitar ?");
		int n = sc.nextInt();
		int[] lista = new int[n];
		for (int i = 0 ; i < n ; i ++) {
			System.out.println("Digite um numero: ");
			sc.nextLine();
			lista[i] = sc.nextInt();
			
		}
		int soma = 0; 
		double media = 0.0;
		int contador = 0;
		for (int numero : lista) {
			if (numero % 2 ==0) {
				soma += numero;
				contador ++;
			}
		}
		if (soma > 0) {
		media = soma / contador;
		System.out.println("A media dos pares é: " + media);
		} else {
			System.out.println("Nenhum Numero Par! " );
		}
		
	}

}
