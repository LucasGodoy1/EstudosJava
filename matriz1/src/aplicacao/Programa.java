package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de linhas: ");
		int linha = sc.nextInt();
		System.out.println("Numero de colunas: ");
		int coluna = sc.nextInt();
		
		int[][] matriz = new int[linha][coluna];
		
		for (int i = 0 ; i < linha ; i ++) {
			for (int c = 0 ; c < coluna ; c ++) {
				
				System.out.println("Numero da matriz ");
				matriz[i][c] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("-----------------------");
		for (int i = 0 ; i < linha ; i ++) {
			System.out.println();
			for (int c = 0 ; c < coluna ; c ++) {
				System.out.print(matriz[i][c] + " ");
				
			}
			
		}
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("Qual Numero deseja encontrar? ");
		int x = sc.nextInt();
		for (int i = 0 ; i < linha ; i ++) {
			for (int c = 0 ; c < coluna ; c ++) {
				if (matriz[i][c] == x) {
					System.out.println("Posicao " + i + ", " + c + ": ");
					if (c > 0) {
						System.out.println("Esquerda " + matriz[i][c-1]);
					}
					if (c < matriz[i].length-1) {
						System.out.println("Direita " + matriz[i][c+1]);
					}
					if (i > 0) {
						System.out.println("Cima " + matriz[i-1][c]);
					}
					if (i < matriz.length-1) {
						System.out.println("Baixo " + matriz[i+1][c]);
					}
				}
			}
		}
		System.out.println(matriz[linha].length);
			
				
			
				
		
			
		
		
		
		
		sc.close();
	}

}
