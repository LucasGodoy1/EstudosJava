package entidade;

public class Usuario  extends Pessoa{
	public Usuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido =0;
		
	}
	private String login;
	private int totAssistido;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Usuario login "
				+  login
				+ ", totAssistido=" 
				+ totAssistido + "]";
	}
	
	
	

}
