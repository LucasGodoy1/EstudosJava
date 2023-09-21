package App;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Joao", "Pedro", "Ana", "Maria");
		   // Loop tradicional usando for-each
        for (String pessoa : aprovados) {
            System.out.println(pessoa);
        }
        System.out.println();
        
        // Usando uma função lambda aqui
        aprovados.forEach(nome -> { // Função lambda começa aqui
            System.out.println(nome + " !!!!");
        }); // Função lambda termina aqui
        System.out.println();
        
        // Usando uma função de referência (método de referência)
        aprovados.forEach(System.out::println); // Método de referência aqui
        System.out.println("-------------");
        
        // Chamando um método no lambda
        aprovados.forEach(nome -> { // Função lambda começa aqui
            printa(nome + " !!!!"); // Chamando o método printa no lambda
        }); // Função lambda termina aqui
        
        // Usando um método de referência para chamar o método printa
        //aprovados.forEach(Foreach::printa);

		
	}
	//criado um metodo para imprimir, ele será chamado no LAMBDA ACIMA
	static void printa(String nome) {
		System.out.println(nome);
	}

}
