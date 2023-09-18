/* Este programa solicita ao usuário informações sobre estoque e as salva em um arquivo
O arquivo gerado esta na pasta D:\eclipse-classe\arquivosGenericos\Documentos\out */
package App;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Estoque;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Estoque> lista = new ArrayList<>();

		
		System.out.println("Caminho que deseja salvar o arquivo: ");
		String caminho = sc.next(); // Solicita ao usuário o caminho onde deseja salvar o arquivo

		File save = new File(caminho);
		 // Cria um objeto File com o caminho especificado
		
		
		String pasta = save.getPath();
		// Obtém o caminho absoluto da pasta

		System.out.println("Pasta de Origin " + pasta);
		// Exibe o caminho da pasta de origem
		
		
		// Cria uma pasta chamada "out" dentro da pasta de origem
		Boolean sucesso = new File(pasta + "\\out").mkdir(); // caminho chaamdo "pasta" + pasta out
		 // mkdir cria uma nova pasta que nesse caso
        // será a pasta "out", ou seja, recebe o caminho + a pasta "out"

		if (sucesso == true) {
			System.out.println("Pasta Criada com sucesso !");
		} else {
			System.out.println("ERRO ! nao foi possivel criar a pasta");
		}

		String arquivoDestino = pasta + "\\out\\sumario.csv";
		sc.nextLine();  // Define o caminho do arquivo de destino

		while (true) {
			System.out.println("Nome: ");
			String nome = sc.nextLine().toUpperCase();
			System.out.println("Preco: ");
			Double preco = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			lista.add(new Estoque(nome, preco, quantidade));
			// Adiciona um objeto Estoque à lista
			

			System.out.println("Deseja continuar ?");
			String dej = sc.next().toUpperCase().trim().substring(0, 1);
			sc.nextLine();

			if (dej.equals("S")) {
				continue;
			} else if (dej.equals("N")) {
				break;
			} else {
				System.out.println("usa Apenas [S] OU [N]");
				
			}

		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoDestino, true))) {
		// Escreve os dados no arquivo
			for (Estoque coisa : lista) {
				writer.write(coisa.toString()); // Converte o objeto 'est' em uma string
				writer.newLine(); // Adiciona uma nova linha no arquivo
			}
			System.out.println("Informações registradas no arquivo.");
		} catch (IOException e) {
			// Trata erros de escrita no arquivo
			System.out.println("ERRO! Não foi possível escrever no arquivo: " + e.getMessage());
		}

	}

}
