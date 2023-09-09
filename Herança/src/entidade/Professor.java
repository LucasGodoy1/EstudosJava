package entidade;

public class Professor extends Pessoa {
	
	private String escolherEspecialidade;
	private Double salario;
	
	public void receberAumento(double aumento) {
		this.salario += aumento;
	}

	public String getEscolherEspecialidade() {
		return escolherEspecialidade;
	}

	public void setEscolherEspecialidade(String escolherEspecialidade) {
		this.escolherEspecialidade = escolherEspecialidade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	

}
