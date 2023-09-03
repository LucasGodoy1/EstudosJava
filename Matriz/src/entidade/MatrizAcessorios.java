package entidade;

import java.util.Scanner;

public class MatrizAcessorios {
	
	
		
	

	public static void gravandoNumeros(int[][] lista, int linha , int coluna) {
		Scanner sc = new Scanner(System.in);
		for (int l = 0 ; l < linha ; l++) {
			for (int c = 0 ; c < coluna ; c ++) {
				System.out.println("Digite o Numero para a Linha: " + l + " Coluna: " + c );
				 lista[l][c] = sc.nextInt();
			}
		}
		sc.close();
		
		
	}
	public static void mostreMatriz(int[][] lista, int linha , int coluna) {
		for (int L = 0 ; L < linha ; L++) {
			System.out.println();
			for (int C = 0 ; C < coluna ; C++) {
				System.out.print(lista[L][C] + "   ");
			}
		}
		
	}
	public static void encontreNumero(int[][] lista, int linha , int coluna, int numero) {
		for (int L = 0 ; L < linha ; L++) {
			for (int C = 0 ; C < coluna ; C++) {
				if (lista[L][C] == numero) {
					System.out.println("Posição Encontrda " + L + ", " + C);
					if (lista[L][C] > 0) {
						System.out.println("Numero a sua esquerda: " + lista[L][C-1]);
					}
					if (C < coluna-1) {
						System.out.println("Numero a sua Direita: " + lista[L][C+1]);
					}
					if (L > 0) {
						System.out.println("Numero Acima : " + lista[L-1][C]);
					}
					if (L < linha-1) {
						System.out.println("Numero Abaixo " + lista[L+1][C]);
					}
				}
			}
		}
		
	}
	
	
}
