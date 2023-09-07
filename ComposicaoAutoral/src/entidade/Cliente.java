package entidade;

public class Cliente {
	private String email;
	private String nomeCompleto;
	private String cep;
	private String endereco;
	// CPF
	// DATA DE NASCIMENTO
	
	public Cliente(){
		
	}
	public Cliente(String email, String nomeCompleto, String cep, String endereco) {
		this.email = email;
		this.nomeCompleto = nomeCompleto;
		this.cep = cep;
		this.endereco = endereco;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "email "
				+  email 
				+ "\nNome Completo: " 
				+ nomeCompleto.toUpperCase() 
				+ "\nCEP: " 
				+ cep 
				+ "\nEndereco " 
				+ endereco
				;
	}
	
	
	
	
	
	
	
	
	
	
	

}
