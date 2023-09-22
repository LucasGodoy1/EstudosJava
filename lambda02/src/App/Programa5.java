package App;

import java.util.function.UnaryOperator;

public class Programa5 {

	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		System.out.println(maisDois.apply(10));
		System.out.println(vezesDois.apply(10));
		System.out.println(aoQuadrado.apply(10)); 
		
		System.out.println("----------");
		
		int result = maisDois        //0 + 2 = 2
				.andThen(vezesDois)  // 2 * 2 = 4
				.andThen(aoQuadrado) // 4 * 4 = 16
				.apply(0);
		System.out.println(result);
		
		
		

	}

}
