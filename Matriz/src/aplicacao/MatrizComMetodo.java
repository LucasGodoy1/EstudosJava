package aplicacao;

import java.util.Scanner;
import entidade.MatrizAcessorios;

public class MatrizComMetodo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamanho da Linha: ");
        int linha = sc.nextInt();
        System.out.println("Tamanho da Coluna: ");
        int coluna = sc.nextInt();

        int[][] lista = new int[linha][coluna];

        sc.nextLine();

        MatrizAcessorios.gravandoNumeros(lista, linha, coluna);
        sc.nextLine();
        System.out.println("--------------------------------");
        MatrizAcessorios.mostreMatriz(lista, linha, coluna);
        System.out.println();
        
        System.out.println("Qual Numero Deseja Encontrar ?");
        int encontre = sc.nextInt();
        MatrizAcessorios.encontreNumero(lista, linha, coluna, encontre);
        
        
        

        sc.close();
    }
}
