package App;

import Entidade.Cachorro;
import Entidade.Lobo;

public class Programa {

	public static void main(String[] args) {
		Lobo x = new Lobo();
		x.emitirSom();	
		Cachorro c = new Cachorro();
		
		c.reagir(2, 12.5);
		c.reagir(17, 4.5);

	}

}
