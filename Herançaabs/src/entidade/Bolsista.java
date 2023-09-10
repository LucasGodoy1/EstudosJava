package entidade;

public class Bolsista extends Aluno{
	private Double bolsa;
	
	
	public void renovarBolsa() {
		System.out.println("Renovando Bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista pagamento facilitado");
		
	}

	public Double getBolsa() {
		return bolsa;
	}

	public void setBolsa(Double bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
	

}
