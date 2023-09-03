package aplicacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Programa {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2023-08-31");
		LocalDateTime d05 = LocalDateTime.parse("2023-08-31T01:30:26");
		Instant d06 = Instant.parse("2023-08-31T01:30:26z");
		Instant d07 = Instant.parse("2023-08-31T01:30:26-03:00");

		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		
		
	}

}
