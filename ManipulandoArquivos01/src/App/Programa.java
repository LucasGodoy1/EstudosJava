/*Bloco try-with-resources
• É um bloco try que declara um ou mais recursos, e garante que esses
recursos serão fechados ao final do bloco
• Disponível apartir do Java 7 em diante */
package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		String caminho = "D:\\eclipse-classe\\qualquer.txt";

		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho));) {

			String linha = br.readLine();
			while (linha != null) { //enquanto linha for diferente de nulo significa que foi lido com sucesso
				System.out.println(linha);
				linha = br.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("ERRO! " + e.getMessage());
		}
	

	}

}
