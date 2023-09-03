package aplicacao;

import java.security.DrbgParameters.NextBytes;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite Quantas vezes deseja: ");
		int n = sc.nextInt();
		int[] vetorPositivo = new int[n];
		int[] vetorNegativo = new int[n];
		
		for (int i = 0 ; i < n ; i ++) {
			int numero = sc.nextInt();
			if (numero >= 0) {
				vetorPositivo[i] = numero;
			}else {
				vetorNegativo[i] = numero;
			}			
			
		}
		
		System.out.println("----Vetor Positivo------");
		for (int i = 0 ; i < n ; i ++) {
			if (vetorPositivo[i] != 0) {
			System.out.println(vetorPositivo[i]);
			}
						
		}
		System.out.println("----Vetor Negativo------");
		for (int i = 0 ; i < n ; i ++) {
			if (vetorNegativo[i] != 0) {
			System.out.println(vetorNegativo[i]);
			}
		}
		
		
        
		
		
		
		
		
		
		
		

	}

}
