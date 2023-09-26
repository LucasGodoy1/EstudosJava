package entidade;

public class Produto {
	private String nome;
	private Double preco;
	private Double desconto;
	private Double valorFrete;
	
	public Produto(String nome, Double preco, Double desconto, Double valorFrete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.valorFrete = valorFrete;
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

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}
	
	
	
	
	

	
	

}
