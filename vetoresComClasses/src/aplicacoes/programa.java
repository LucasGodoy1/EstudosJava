package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de items");
		int n = sc.nextInt();
		Produtos[] vetor = new Produtos[n];
		
		
		for (int i = 0 ; i < n ; i++) {
			sc.nextLine();
			System.out.println("Produto: ");
			String nome = sc.nextLine();
			System.out.println("Preco: R$: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produtos(nome, preco);

		}
		double soma = 0.0;
		for (int i = 0 ; i < n ; i++) {
			soma = soma + vetor[i].getPreco();
			
		}
		double media = soma / n;
		
		System.out.printf("A media de preco R$: %.2f", media);

	}

}
