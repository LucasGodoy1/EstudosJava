package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantas pessoas será caddastradas ?");
		int n = sc.nextInt();
		String[] listaNome = new String[n];
		byte[] listaIdade = new byte[n];
		byte maior= 0;
		
		for (int i = 0 ; i < n ; i ++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			listaNome[i] = sc.nextLine();
			System.out.println("Idade:  ");
			listaIdade[i] = sc.nextByte();
			
			
		}
		
		String nomeMaisVelho = "";
		for (int i = 0 ; i < n ; i ++) {
			if (listaIdade[i] > maior) {
				maior = listaIdade[i];
				nomeMaisVelho = listaNome[i];
			}
		}
		System.out.println("Nome do mais velho :" + nomeMaisVelho + " Idade: " + maior);
		
		

	}

}
