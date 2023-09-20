package modelo.entidade;

public class Fatura {
	private Double pagamentoBasico;
	private Double taxa;
	//private Double totalPagamento;
	
	public Fatura() {
		
	}

	public Fatura(Double pagamentoBasico, Double taxa, Double totalPagamento) {
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;

	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double getTotalPagamento() {
		return pagamentoBasico - getTaxa();
	}


	

	
	

}
