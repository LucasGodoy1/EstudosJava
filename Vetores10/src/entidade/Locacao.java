package entidade;

public class Locacao {
	private String nome;
	private String email;
	
	public Locacao(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	public Locacao() {
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Nome: " + nome + " E-mail: " + email;
	}
	
	
	
}
