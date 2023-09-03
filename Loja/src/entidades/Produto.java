package entidades;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	
	
	

	public double totalEmEstoque() {
		double resultado = preco * quantidade;
		return resultado;
	}
	public void addQuantidadeEmEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
        return nome 
        		+ ", $" 
        		+ String.format("%.2f", preco) 
        		+ ", Unidade: " 
        		+ quantidade
                + ", Total em Estoque: $" 
        		+ String.format("%.2f", totalEmEstoque());
    }
}
