package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		String caminho = "D:\\eclipse-classe\\qualquer.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
//tambem é possivel usar 
//br = new BufferedReader(FileReader(caminho));
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			String linha = br.readLine();
			while (linha != null) { //enquanto linha for diferente de nulo significa que foi lido com sucesso
				System.out.println(linha);
				linha = br.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("ERRO! " + e.getMessage());
		}
		finally {
			try {
				
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
