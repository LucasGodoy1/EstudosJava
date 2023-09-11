package Entidade;

public class Cachorro extends Lobo {

	@Override
	public void emitirSom() { // feito sobre carga do metodo emitir som da classe Mamifero
		System.out.println("Latir Au Au Au");
	}

	public void reagir(String frase) {
		if (frase == "toma comida" || frase == "ola") {
			System.out.println("Abanar e latir");
		} else {
			System.out.println("Rosnar");
		}

	}

	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar ");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e latir");
		}

	}

	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar ");
			this.emitirSom();
		} else {
			System.out.println("Rosnar e Latir ");
		}

	}

	public void reagir(int idade, double peso) {
		if (idade < 5 && peso < 10) {
			System.out.println("Abanar e Latir");

		} else if (idade > 10) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Rosnar");
		}

	}

}
