package App;

import entidade.Caixa;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		
		caixaA.guardar("Itens");
		String entrega = caixaA.abrir();
		
		System.out.println(entrega);
		
		Caixa<Double> carteira = new Caixa<>();
		
		carteira.guardar(3456.0);
		
		System.out.println(carteira.abrir());
		

	}

}
