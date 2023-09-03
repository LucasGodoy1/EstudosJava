package aplicacao;

import java.util.Scanner;

import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retanguloA = new Retangulo();
		System.out.println("Digite a Base: ");
		retanguloA.base = sc.nextDouble();
		System.out.println("Digite a altura: ");
		retanguloA.altura = sc.nextDouble();
		
		double area = retanguloA.calculoRetangulo();
		double perimetro = retanguloA.calculoPerimetro();
		double diagonal = retanguloA.calculoDiagonal();
		
		System.out.println("Area do retangulo: " + area);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Diagonal: " + diagonal);
		
			
		
		
		
		
		
		
	}

}
