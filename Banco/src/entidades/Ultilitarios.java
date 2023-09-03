package entidades;

public class Ultilitarios {

	private String nome, agencia, conta;
	private double saque, deposito, saldo, juros;
	
	
	public Ultilitarios() {
		
	}
	public Ultilitarios(String nome, String agencia, String conta, double deposito) {
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = deposito;
		
		}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSaque(double saque) {
		if (saque > this.saldo) {
			System.out.println("Saldo Insuficiente!");}else {
				this.saque = saque;
				this.saldo = (this.saldo -  saque) - 5.00;
				this.juros = 5.00;
			}
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
		this.saldo += deposito;
	}

	
	
	public String toString() {
		return " Nome: " 
				+ nome + " Agencia: " 
				+ agencia  + " Conta: "
				+ conta  + " Saldo: "
				+ String.format("%.2f", saldo);
	}
	
	public void extrato() {
		System.out.println("Nome: " 
				+ nome + " Agencia: " 
				+ agencia  + " Conta: "
				+ conta  );
		System.out.printf("deposito: R$ %.2f \n", deposito);
		System.out.printf("Saque: R$ %.2f \n", saque);
		System.out.println("Juros de saque -R$: " + juros);
		System.out.printf("Saldo Atual: R$ %.2f \n", saldo);
	}
	
	
	
	
	
	
}
