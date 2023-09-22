package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Programa4 {

	public static void main(String[] args) {
		Supplier<List<String>> umaLista =
				()-> Arrays.asList("ana", "maria", "Luan");
				
				System.out.println(umaLista.get());

	}

}
