package entidade;

public class Conta {
	private Cliente dados;
	private Integer numeroConta = 546234;
	private String numeroAgencia = "000-1";
	private Double saldo = 0.0;
	private Double taxa = 0.0;
	private Double limiteSaldo = 0.0;
	private Double saque = 0.0;
	private Double deposito = 0.0;
	private Double transferencia = 0.0;
	

	public Conta(Cliente dados) {
		this.dados = dados;

	}
	public Conta(Cliente dados, Double saldo) {
		this.dados = dados;
		this.saldo = saldo;

	}

	public Conta(Cliente dados, Integer numeroConta, String numeroAgencia, Double saldo) {
		this.dados = dados;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
	}

	public Conta(Cliente dados, Integer numeroConta, String numeroAgencia, Double saldo, Double taxa,
			Double limiteSaldo) {
		this.dados = dados;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
		this.taxa = taxa;
		this.limiteSaldo = limiteSaldo;
	}
	
	public void addSaldo(double deposito) {
		this.saldo += deposito;
		this.deposito += deposito;
	}
	
	public void removeSaldo(double saque) {
		this.saldo -= saque;
		this.saque -= saque;
	}
	public void addTaxa(double taxa) {
		this.taxa -= saldo;
		System.out.println("- R$ " + taxa );
	}
	
	

	public Cliente getDados() {
		return dados;
	}
	public void setDados(Cliente dados) {
		this.dados = dados;
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public Double getSaldo() {
		return saldo;
	}
	// set saldo removido
	
	
	public Double getTaxa() {
		return taxa;
	}
	// set taxa removido
	
	public Double getLimiteSaldo() {
		return limiteSaldo;
	}
	public void setLimiteSaldo(Double limiteSaldo) {
		this.limiteSaldo = limiteSaldo;
	}
	
	public void getExtrato() {
		System.out.println("Saldo Atual: " 
	+ saldo 
	+ " Saque: " 
	+ saque 
	+ " Depositos: " 
	+ deposito 
	+ " Transferencia: " 
	+ transferencia);
	}
	
	
	
	@Override
	public String toString() {
		return "Conta dados " 
	+ dados.toString() + "\n" + "\n" 
	+ "Numero Conta " 
	+ numeroConta + "\n"
	+ "Agencia " +
	numeroAgencia + "\n" + "Saldo R$: " + saldo + "\n" +  "Saldo Limite " + limiteSaldo ;
	}
	
	
	

}
