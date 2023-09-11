package App;

public class Ave extends Animal{
	private String corDaPena;
	

	@Override
	public void locomover() {
		System.out.println("Voando ");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comer Frutas ");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave ");
		
	}
	
	public void fazerNinho() {
		System.out.println("Fazendo Ninho ");
	}

	public String getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}
	
	
	
	

}
