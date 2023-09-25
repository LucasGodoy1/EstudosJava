package App;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import entidade.Produto;

public class Programa7 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("TV", 3235.89, 13.0);
		
		BiFunction<Double, Double, Double> subTotal = (x, y) -> {
			double result = x -  (x * y / 100);
			return result;
		};
		
		UnaryOperator<Double> imp = x ->{
			if (x >= 2500) {
				return x + (x * 8.5 / 100);
			}else {return x + 0.0;} 
		};
		
		UnaryOperator<Double> frete = x ->{
			if (x >= 3000) {return x + 100.0;
			}else {return x + 50.0;} 
		};
		
		Function<Double, String> total = x ->{
			return String.format("%.2f", x);
		};
				
		
		System.out.println("------------------------");
		
				
		System.out.println("Valor Total R$: " + subTotal.andThen(imp).andThen(frete).andThen(total).apply(p1.getPreco(), p1.getDesconto()));
		
		
		
		

	}

}
