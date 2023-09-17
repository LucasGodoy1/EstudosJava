package App;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho: ");
		String arquivoCaminho = sc.nextLine();
		
		File pastas = new File(arquivoCaminho);
		File[] pasta = pastas.listFiles(File::isDirectory);
		System.out.println("Pastas: ");//linha acima tem um filtro que seleciona apenas pastas
		for (File arquivo : pasta ) {
			System.out.println(arquivo);
		}
		File[] arquivos = pastas.listFiles(File::isFile);
										 //lista acima tem um filtro que seleciona apenas arquivos
		System.out.println("Arquivos: ");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		Boolean sucesso = new File(arquivoCaminho + "\\subPasta").mkdir();
								//Criando uma subpasta da paasta que foi informada
		System.out.println("Diretorio Criado com sucesso! " + sucesso);
		
		sc.close();
		
		
	}

}
