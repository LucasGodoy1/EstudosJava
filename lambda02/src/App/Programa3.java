package App;

import java.util.function.Function;

public class Programa3 {

	public static void main(String[] args) {
	//por ser apenas 1 parametro não é necessario colocar os ( )
	// essa lambda irá verificar o numero e dps retornar uma string
		Function<Integer, String>parOuImpar = 
				numero -> numero % 2 ==0 ? "PAR" : "Impar";
				     //(if é o mesmo que ?)  ( : é o msm q else)
				
		System.out.println(parOuImpar.apply(531));
		
		// essa lambda irá retornar uma string pré definida + uma string passada no parametro
		Function<String, String> resultado = 
				result -> "resultado é " + result;
		System.out.println("------------------------------------");
				
				// chamando 2 lambdas AO MESMO TEMPO		
		System.out.println(parOuImpar.andThen(resultado).apply(531));
		
		Function<String, String> empolgado = 
				valor -> valor + " !!!!";
		System.out.println("------------------------------------");
		
		//Tambem é possivel chamar mais de 2 funções ao mesmo tempo usando o "E ENTÃO" ANDTHEN
		System.out.println(parOuImpar
				.andThen(resultado)
				.andThen(empolgado)
				.apply(531));
		

	}

}
