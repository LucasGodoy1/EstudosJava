package entidades;

public class DolarNaMao {

	public static double dolarHoje(double precoDolar, double quantidadeDolar ) {
		double resultado = precoDolar * quantidadeDolar;
		return (resultado * 6 / 100) + resultado;
	}
	
	
	
}
