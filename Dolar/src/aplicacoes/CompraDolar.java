package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entidades.DolarNaMao;

public class CompraDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Contacao do dolar: ");
		double cotacao = sc.nextDouble();
		System.out.println("Dolares desejado: ");
		double dolares = sc.nextDouble();
		System.out.printf("Total + IOF R$ %.2f", DolarNaMao.dolarHoje(cotacao, dolares));
	}

}
