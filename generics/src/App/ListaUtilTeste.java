package App;

import java.util.Arrays;
import java.util.List;

import entidade.ListaUtil;

public class ListaUtilTeste {

	public static void main(String[] args) {
	    // Criando uma lista de Strings e uma lista de Integers
	    List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
	    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

	    // Utilizando o método getUltimo1 da classe ListaUtil
	    // O método getUltimo1 aceita qualquer tipo de lista (?), mas retorna um Object
	    // Portanto, é necessário fazer casting para o tipo desejado ao usá-lo
	    String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs); // Usando cast para String
	    System.out.println( ultimaLinguagem);

	    Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums); // Usando cast para Integer
	    System.out.println(ultimoNumero);

	    // Utilizando o método getUltimo2 da classe ListaUtil
	    // O método getUltimo2 utiliza tipos genéricos (T) para preservar o tipo da lista
	    // Não é necessário fazer casting ao usar esse método
	    String ultimaLinguagem2 = ListaUtil.getUltimo2(langs); // Sem necessidade de cast
	    System.out.println( ultimaLinguagem2);

	    Integer ultimoNumero2 = ListaUtil.getUltimo2(nums); // Sem necessidade de cast
	    System.out.println(ultimoNumero2);

	}

}
