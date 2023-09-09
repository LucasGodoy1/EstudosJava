package App;

import entidade.Luta;
import entidade.Lutador;

public class Programa {

	public static void main(String[] args) {
		Lutador l1 = new Lutador("Prety Boy", "Franca", 31 , 1.75 , 68.9 , 11 , 2 , 1);
		Lutador l2 = new Lutador("Ronaldo", "Italia", 27, 1.77, 68.9, 15, 3, 1);
		
		Luta ufe = new Luta();
		ufe.marcarLuta(l1, l2);
		ufe.lutar();
		System.out.println("====================");
		
		l1.status();
		l2.status();;
		
		
		
		

	}

}
