package entidade;

public class Media {
	private double total;
	private int quantidade;
	
	// Método público chamado "combinar" que recebe dois objts da classe Media como parâmetros
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();//um novo objeto da classe Media
		resultante.total = m1.total + m2.total;//valor da soma dos atributos "total" dos objts m1 e m2 ao atributo "total" do objt "resultante"
		resultante.quantidade = m1.quantidade + m2.quantidade;//valor da soma dos atributos "quantidade" dos objetos m1 e m2 ao atributo "quantidade" do objt "resultante"
		return resultante;// Retorno do objeto "resultante"
	}




	public Media adicionar(double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
	
	public Double getTotal() {
		return total;
	}

	public Double getValor() {
		return total / quantidade;
	}

	
	
	

}
