package aplicacao;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o Tamnho da matriz: ");
		int n = sc.nextInt(); 
		int [][] matriz = new int[n][n];
		int contador = 0;
		
		for (int L = 0 ; L < n ; L++) {
			for (int c = 0 ; c < n ; c++) {
				System.out.println("Digite um numero  na linha: " + L + " coluna: " + c);
				matriz[L][c] = sc.nextInt();
				if (matriz [L][c] < 0) {
					contador ++;
				}

			}
		} System.out.println("Diagonal Principal !");
		
		
			for (int c = 0 ; c < n ; c++) {
				System.out.println(matriz[c][c] + " " );
				
			}
			System.out.println("Numeros negativos = " + contador);
			System.out.println("------ Imprimindo - Matriz-------");
			for (int L = 0 ; L < n ; L++) {
				System.out.println();
				for (int c = 0 ; c < n ; c++) {
					System.out.print(matriz[L][c] + "   ");
				}
			}
					
					
		

	}

}
