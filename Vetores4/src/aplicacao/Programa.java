package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos Numeros deseja digitar ?");
		int n = sc.nextInt();
		double maior = 0.0;
		
		double[] lista = new double[n];
		
		int posicao = 0;
		for (int i = 0 ; i < n ; i ++) {
			System.out.println("Digite um numero: ");
			lista[i] = sc.nextDouble();
			
			
		}
		
		for (int i = 0 ; i < n ; i ++) {
			if (lista[i] > maior) {
				maior = lista[i];
				posicao = i;
			}
		}
		System.out.println("Maior Valor: " + maior);
		System.out.println("Posicao do maiior valor: " +  posicao);

			
		
		
		
		
	}

}
