package entidade;

public abstract class Produto {
	protected String nome;
	protected Double preco;
	
	
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "\nNome: " + nome + " Preco Unidade R$: " + String.format("%.2f", preco) ;
	}
	
	
	
	
	


}
