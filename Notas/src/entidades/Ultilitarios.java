package entidades;

public class Ultilitarios {

	public double a, b, c;
	public String nome;
	
	public double notaTotal() {
		double resultado = a + b + c;
		return resultado;
	}
	public String toString() {
		return "Nome: " 
	+ nome 
	+ "\nNota Total: " 
	+ notaTotal();
	};

	
	
}
