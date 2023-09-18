package App;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o Caminho: ");
		String caminho = sc.next();
		
		File pasta = new File(caminho);
		System.out.println("-----------------------");
		System.out.println("pegueNome: " + pasta.getName());
		System.out.println("pegueCaminhoSemArquivo: " + pasta.getParent());
		System.out.println("pegueCaminhoCompleto: " + pasta.getPath());
		
		
		
		sc.close();
	}

}
