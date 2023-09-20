package modelo.servicos;

public class BrasilTaxa {
	
	
	public double taxa(double mes) {
		if (mes <= 100) {
			return mes * 0.2;
		}else {
			return mes * 0.15;
		}
	}
	

}
