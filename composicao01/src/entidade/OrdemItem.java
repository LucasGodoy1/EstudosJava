package entidade;

public class OrdemItem {

	private Integer quantidade;
	private double preco;
	private Produto produto;
	
	public OrdemItem() {
		
	}
	
	public OrdemItem (Integer quantidade, double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
		
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double subTotal() {
		return quantidade * preco;
		
	}

	@Override
	public String toString() {
		return "Item: " 
	+ getProduto().getNome()
	+ " " 
	+ "preco R$: " 
	+ String.format("%.2f", getPreco()) 
	+ " "
	+ "Quantidade: [" 
	+ quantidade + "] " 
	+ "SubTotal: R$: " 
	+ String.format("%.2f", subTotal());
	}
	


	
	
	
}
