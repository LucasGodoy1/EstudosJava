package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas Pessoas serão cadastradas? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		String[] nomeMenor = new String[n];
		int menor = 0;

		for (int i = 0 ; i < n ; i ++) {
			sc.nextLine();
			System.out.println("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.println("idade:" );
			idade [i] = sc.nextInt();
			System.out.println("Altura:" );
			altura[i] = sc.nextDouble();
			if (idade[i] < 16) {
				menor += 1;
				nomeMenor[i] = nome[i];
			}
			
		}
		
		double soma = 0.0;
		for (int i= 0 ; i < n ; i ++) {
			soma = soma + altura[i];
		}
		double mediaAltura = soma / n;
		System.out.printf("Altura media: %.2f%n ",  mediaAltura);
		double mediaPorcento = ((double) menor / n) * 100.0;
		System.out.println("Pessoas com menor de 16 anos " + mediaPorcento);
		System.out.println();
		
		for (int i = 0 ; i < nomeMenor.length ; i ++) {
			if (nomeMenor[i] != null) {
			System.out.println(nomeMenor[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
