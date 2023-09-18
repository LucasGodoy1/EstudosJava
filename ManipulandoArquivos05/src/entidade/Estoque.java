package entidade;

public class Estoque extends Produto{

	private Integer quantidade;
	private Double valorTotalEmEstoque;

	public Estoque(String nome, Double preco, int quantidade) {
		super(nome, preco);
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getValorTotalEmEstoque() {
		return valorTotalEmEstoque = this.quantidade * this.preco;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "\nQuantidade: [" 
				+ quantidade + "]"  
				+ "\nValor Total R$: " 
				+ String.format("%.2f", getValorTotalEmEstoque())
				+ "\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=";
	}
	
	
	
	
	

	
	


	
	
	

}
