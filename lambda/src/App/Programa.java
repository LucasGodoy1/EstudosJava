package App;

import entidade.Calculo;
import entidade.Multiplicar;
import entidade.Soma;

public class Programa {

	public static void main(String[] args) {
		
		Calculo calc = new Soma();
		System.out.println(calc.executar(10, 5));
		
		calc = new Multiplicar();
		System.out.println(calc.executar(10, 5));
	}

}
