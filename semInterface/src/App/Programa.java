package App;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidade.AluguelCarro;
import modelo.entidade.Veiculo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Modelo do carro: ");
		String modelo = sc.next();
		System.out.println("Data e hora da retirada dd/MM/yyyy HH:mm");
		LocalDateTime inicio = LocalDateTime.parse(sc.next(), fmt);
		System.out.println("Data e hora da retorno dd/MM/yyyy HH:mm");
		LocalDateTime fim = LocalDateTime.parse(sc.next(), fmt);
		
		AluguelCarro cr = new AluguelCarro(inicio, fim, new Veiculo(modelo));
		
		
		
		sc.close();
	}

}
