/*Criando arquivo txt */
package App;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		String[] linhas = new String[] {"Bom Dia", "Boa Tarde", "Boa Noite"};

		String caminho = "D:\\eclipse-classe\\out.txt"; /*FileWrite aceita dois parametros */
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho/*se adicionar ", true" fará com que grave  novas linahs com mais texto, e sem o true ele apenas irá substituir o arquivo ao criar*/))){
			for (String line : linhas) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
