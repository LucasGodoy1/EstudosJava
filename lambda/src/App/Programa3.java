package App;

import java.util.function.BinaryOperator;

public class Programa3 {

	public static void main(String[] args) {
		BinaryOperator<Double> multi = (x, y) ->{return x*y;};
		System.out.println(multi.apply(5.0, 5.0));
		
		BinaryOperator<Integer> somar = (x,y)->{return x + y;};
		System.out.println(somar.apply(5, 5));
		

	}

}
