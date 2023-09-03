package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos Numeros deseja digitar ?");
		int n = sc.nextInt();
		double[] lista = new double[n];
		for (int i = 0 ; i < n ; i ++) {
			System.out.println("Digite um numero: ");
			sc.nextLine();
			lista[i] = sc.nextDouble();
			
		}
		double media, soma = 0.0;
		for (double numero : lista) {
			soma = soma + numero;
		}
		media = soma / n;
		System.out.println("Media do vetor " + media);
		
		for (double numero : lista) {
			if (numero < media) {
				System.out.println(" Abaixo da media " + numero);
			}
		}
		

	}

}
