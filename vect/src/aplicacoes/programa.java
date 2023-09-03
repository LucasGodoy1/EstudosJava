package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----INICIO----");
		int n = sc.nextInt();
		double[] vetor = new double [n];
		
		for (int i =0 ; i < n ; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i = 0 ; i < 3 ; i++) {
			soma = soma + vetor[i];
		}
		
		double media = soma / n;
				
		System.out.println(media);
		
		sc.close();
	}

}
