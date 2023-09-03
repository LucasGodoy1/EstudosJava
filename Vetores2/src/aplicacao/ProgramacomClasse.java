package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Pessoa;

public class ProgramacomClasse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de cadastro: ");
		int n = sc.nextInt();
		Pessoa[] cadastro = new Pessoa[n];
		double pessoaMenorIdade = 0.0;
		double soma = 0.0;
		for (int i = 0 ; i < n ; i ++) {
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			soma += altura;
			cadastro[i] = new Pessoa(nome, idade, altura);
			
			if (idade < 16) {
				
				cadastro[i] = new Pessoa (nome, idade);
				pessoaMenorIdade +=1;
			}
			
		}
		System.out.println("------Maiores de 16 -----");
		
		for (int i = 0 ; i < n ; i ++) {
			if (cadastro[i].getNome() != null) {
				
			System.out.println(cadastro[i]);
			}
		}
		
		
		System.out.println("------Menores de 16 -----");
		for (int i = 0 ; i < n ; i ++) {
			if (cadastro[i].getNomeMenor() != null) {
				
				System.out.println(cadastro[i].toString1());
			}
		}
		
		double alturaMediaCadastrada = Pessoa.mediaAltura(soma, n);
		System.out.println("------------------- -----");
		System.out.printf(" Altura media: %.2f%n ", alturaMediaCadastrada);
		double porc = Pessoa.MediaPorcentual(pessoaMenorIdade, n);
		System.out.println("Porcentagem de pessoas menores de 16: " + porc + "%" );
		
		
		
		
		
		
		

	}

}
