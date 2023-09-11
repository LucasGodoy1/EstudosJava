package App;


public class Mamifero extends Animal {
	private String corDoPelo;

	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamifero");
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	
	
	
}
