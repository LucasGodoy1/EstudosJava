package modelo.servicos;

import modelo.entidade.AluguelCarro;
import modelo.entidade.Fatura;

public class AluguelServicos {
	private Double precoPorDia;
	private Double precoPorHora;
	
	private BrasilTaxa taxaServicos;

	public AluguelServicos(Double precoPorDia, Double precoPorHora, BrasilTaxa taxaServicos) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServicos = taxaServicos;
	}
	
	/*public void processandoFatura(AluguelCarro aluguelCarro) {
		aluguelCarro.setFatura(new Fatura(50.0, 10.0));
	} */
	
	
	
	

}
