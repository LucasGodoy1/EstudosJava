package App;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {
// leitura basica de arquivos
	public static void main(String[] args) {
		File arquivo = new File("D:\\eclipse-classe\\qualquer.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) { //testando se ainda existe uma nova linha no arquivo
				System.out.println(sc.nextLine()); //se existir uma linha, imprima a linha
			} 
		}catch (IOException e) {
			System.out.println("ERRO!" + e.getMessage());
		}
		finally {
			if (sc != null) {
				
				sc.close();
			}
		} 

	}

}
