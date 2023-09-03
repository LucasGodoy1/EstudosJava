package aplicacao;

import java.util.Scanner;

import entidade.Locacao;

public class Analise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locacao[] vetor = new Locacao[10];
		System.out.println("Quantos Quartos deseja reservar? ");
		int n = sc.nextInt();
		for (int i = 1 ; i <=n ; i ++ ) {
			sc.nextLine();
			System.out.println(" Cadastro N° " + i);
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("E-Mail: ");
			String email = sc.nextLine();
			System.out.println("Qual quarto deseja? ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Locacao(nome, email);
			
		}
		System.out.println("---------------");
		System.out.println(vetor.length);
		
		for (int i = 0 ; i <vetor.length ; i ++) {
			if (vetor[i] != null) {
				System.out.println(vetor[i]);
			}
		}
		
		
		
		
		
		

	}

}
