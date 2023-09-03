package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o dado do Produto: ");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		
		
		Produto prod = new Produto(nome, preco);
		
		prod.setNome("Computador");
		System.out.println("Nome atualizado: " + prod.getNome());
		prod.setPreco(1200.0);
		System.out.println("Preco atualizado: " + prod.getPreco());
		
		System.out.println("----------------");
		System.out.println("Dados do Produto: " + prod);
		
		System.out.println("----------------");
		System.out.println("Digite o numero de produtos a ser adicionado em estoque");
		int quantidade = sc.nextInt();
		System.out.println("----------------");
		prod.addQuantidadeEmEstoque(quantidade);
				
		System.out.println("Dados Atualizados: " + prod);
		System.out.println("----------------");
		
		System.out.println("Digite o numero de produtos a ser removidos em estoque");
		quantidade = sc.nextInt();
		prod.removerProdutos(quantidade);
		System.out.println("----------------");
		
		System.out.println("Dados Atualizados: " + prod);
		
		
		
		
		
		sc.close();

	}

}
