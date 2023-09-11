package App;

public class Programa {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		m.setPeso(35.5);
		m.alimentar();
		m.locomover();
		m.emitirSom();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		j.locomover();
		k.emitirSom();
		c.locomover();
		c.usarBolsa();
		
		
		
	}

}
