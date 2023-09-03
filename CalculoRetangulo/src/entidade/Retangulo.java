package entidade;

public class Retangulo {

	public double base, altura, perimetro, diagonal;
	
	public double calculoRetangulo() {
		double area = base * altura;
		return area;
	}
	public double calculoPerimetro() {
		perimetro = 2* (base + altura);
		return perimetro;
	}
	public double calculoDiagonal() {
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		return diagonal;
	}
	
	
	
}
