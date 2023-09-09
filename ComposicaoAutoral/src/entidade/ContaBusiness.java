package entidade;

public class ContaBusiness extends Conta {
	private String nomeEmpresa;
	private Double businessLimit;
	private Double emprestimo;
	
	
	
	
	public ContaBusiness(
			Cliente dados, String nomeEmpresa, Double businessLimit, Double emprestimo) {
		super(dados);
		this.nomeEmpresa = nomeEmpresa;
		this.businessLimit = businessLimit;
		this.emprestimo = emprestimo;
	}




	public ContaBusiness(
			Cliente dados, Integer numeroConta, String numeroAgencia, Double saldo) {
		super(dados, numeroConta, numeroAgencia, saldo);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
