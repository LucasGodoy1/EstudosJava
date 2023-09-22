package App;

import java.util.function.Predicate;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		// Criação de um Predicate chamado isCaro que verifica se um produto é caro.
		Predicate<Produto> isCaro = 
				prod -> (prod.getPreco() - (prod.getPreco() * prod.getDesconto() / 100)) >= 1200;
		
		// Criação de um objeto Produto chamado "produto" com nome, preço e desconto.
		Produto produto = new Produto("TV", 2300.0, 10.0);
		
		// Imprime o resultado de isCaro.test(produto), ou seja, verifica se o produto é caro.
		System.out.println(isCaro.test(produto));
		
		// Calcula o preço final do produto após aplicar o desconto e o imprime.
		System.out.println(produto.getPreco() - (produto.getPreco() * produto.getDesconto() / 100));
	}
}
