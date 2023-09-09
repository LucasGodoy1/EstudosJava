package entidade;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private Double altura;
	private Double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	public void apresentar() {
		System.out.println("----------------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o Lutador " + this.getNome());
		System.out.println("Diretamente Da " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " Anos e " + this.getAltura());
		System.out.println("Pesando " + this.getPeso() + " Kg");
		System.out.println(this.getVitorias() + " Vitorias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpates() + " Empates");
		System.out.println("----------------------------------------------------");
		
	}
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria() );
		System.out.println("Ganhou " + this.getVitorias() + " Vezes");	
		System.out.println("Perdeu " + this.getDerrotas() + " Vezes");
		System.out.println("Empatou " + this.getEmpates() + " Vezes");	
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		//lembrete!
		// mesma coisa que o comando abaixo
		//this.vitorias = this.vitorias + 1;
		// this.vitorias += 1;
					
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarluta() {
		 this.setEmpates(getEmpates() + 1);
	}
	
	
	
	public Lutador(String nome, String nacionalidade, int idade, Double altura, Double peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso); // set peso esta chamando o setcategoria e verifica qual categoria que ele está
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.0) {
			this.categoria = "Invalido";
		}else if (this.peso <= 72) {
			this.categoria = "Leve";
		}else if (this.peso <= 83.0) {
			this.categoria = "Media";
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "INVALIDO";
		}
		
		
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	
	

}
