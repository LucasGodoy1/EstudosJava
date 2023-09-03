package entidade;

public class Salario {

	public String nomeFuncionario;
	public double salarioBruto, taxa;
		
	public double calculoTaxa(){
		double resultado = salarioBruto * 16.6 / 100;
		return resultado;
	}
	public double calculoSalarioLiquido() {
		double resultado = salarioBruto - (salarioBruto * 16.6 / 100); 
		return resultado; 
	}
	public void addMaiSalario(double porcentagem) {
		salarioBruto = salarioBruto + (salarioBruto * porcentagem / 100);
		
	}
	public String toString() {
		return "nome: " 
				+ nomeFuncionario
				+ "\nSalario Bruto R$:" 
				+ String.format(" %.2f%n", salarioBruto)
				+ "Taxa: "
				+ String.format("R$: %.2f",calculoTaxa())
				+ "\nSalario Liquido R$:" 
				+ String.format("%.2f",calculoSalarioLiquido());
	}
	
	
}
