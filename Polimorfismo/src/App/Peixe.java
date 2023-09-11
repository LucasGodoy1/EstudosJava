package App;

public class Peixe extends Animal{
	private String cordeEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando ");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substancias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe nao faz som");
	}
	public void soltarBolha() {
		System.out.println("Soltando Bolha");
	}

	public String getCordeEscama() {
		return cordeEscama;
	}

	public void setCordeEscama(String cordeEscama) {
		this.cordeEscama = cordeEscama;
	}
	
	

}
