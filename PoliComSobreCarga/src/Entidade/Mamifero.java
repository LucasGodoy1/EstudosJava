package Entidade;

public class Mamifero extends Animal{
	protected String corDoPelo;

	@Override // feito sobre carga do metodo emitir som da classe Animal
	public void emitirSom() {
		System.out.println("Som De Mamifero");
		
	}
	
	
	

}
