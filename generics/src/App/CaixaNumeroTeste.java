package App;

import entidade.CaixaInt;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaInt<Double> caixaA = new CaixaInt<>();
		caixaA.guardar(2.3);
		System.out.println(caixaA.abrir());

	}

}
