package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantas pessoas será caddastradas ?");
		int n = sc.nextInt();
		char[] listaSexo = new char[n];
		double[] listaAltura = new double[n];
		
		
		for (int i = 0 ; i < n ; i ++) {
			System.out.printf("sexo da %da pessoa:\n", i + 1);
			sc.nextLine();
			listaSexo[i] = sc.next().toUpperCase().charAt(0);
			System.out.println("altura:  ");
			listaAltura[i] = sc.nextDouble();
						
		}
		int contador = 0;
		double media = 0.0;
		double soma = 0.0;
		for (int i = 0 ; i < n ; i ++) {
			if (listaSexo[i] == 'F') {
				soma += listaAltura[i];
				contador ++;
			}
		}
		int contadorMasculino = 0;
		
		media = soma / contador;
		System.out.printf("Media das alturas das mulheres: %.2f%n", media);
		for (int i = 0 ; i < n ; i ++) {
			if (listaSexo[i] == 'M') {
				contadorMasculino ++;
			}
		}
		System.out.println("Numero de Homens: " + contadorMasculino);

	}

}
