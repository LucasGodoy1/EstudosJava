package entidade;

public class Conta {
	private Cliente dados;
	private Integer numeroConta = 546234;
	private String numeroAgencia = "000-1";
	private Double saldo = 0.0;
	private Double taxa = 0.0;
	private Double limiteSaldo = 0.0;

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
	}
	
	public void removeSaldo(double saque) {
		this.saldo -= saque;
	}
	public void addTaxa(double taxa) {
		this.taxa -= saldo;
		System.out.println("- R$ " + taxa );
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
