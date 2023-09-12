package entidade;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected Double xp;
	
	
	
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.xp = 0.0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Double getXp() {
		return xp;
	}
	public void setXp(Double xp) {
		this.xp = xp;
	}
	@Override
	public String toString() {
		return "Cadastro:  \nnome " + nome + ", idade " + idade + ", sexo " + sexo + ", xp " + xp + " ";
	}

	
	

}
