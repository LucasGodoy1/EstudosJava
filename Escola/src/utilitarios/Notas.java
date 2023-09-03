package utilitarios;

public class Notas {
	
public String nome;
public double a;
public double b;
public double c;
	
	public double media() {
		double resultado = (a + b + c) /3;
		return resultado;
	}
	public void nomealuno() {
		System.out.println(nome);
	}
	
}
