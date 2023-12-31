package entidade;

public class Pessoa {

	private String nome, nomeMenorIdade;
	private int idade, menorIdade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura= altura;
		
	}
	
	public Pessoa(String  nomeMenorIdade, int menorIdade) {
		this.nomeMenorIdade = nomeMenorIdade;
		this.menorIdade = menorIdade;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getidade () {
		return idade;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	public String getNomeMenor() {
		return nomeMenorIdade;
	}
	public int getMenorIdade() {
		return this.menorIdade;
	}
	
	public static double MediaPorcentual(double menorIdade, double totalPessoas) {
		return (menorIdade / totalPessoas) * 100.0;
	}
	public static double mediaAltura(double Somaaltura, int totalPessoas) {
		double media = Somaaltura  / totalPessoas;
		return media;
	}
	
	
	public String toString1() {
		return "Nome: " 
	+ nomeMenorIdade 
	+ " Idade: " 
	+ menorIdade;
	}
	
	
	public String toString() {
		return "Nome: " 
	+ nome 
	+ " Idade: " 
	+ idade 
	+ " Altura: " 
	+ altura;
	}
	
	
	
	
	
}
