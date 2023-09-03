package secretaria;

import java.util.Scanner;

import utilitarios.Notas;

public class Dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Notas aluno1;
		aluno1 = new Notas();
		System.out.println("Digite a nota: ");
		aluno1.a = sc.nextDouble();
		aluno1.b = sc.nextDouble();
		aluno1.c = sc.nextDouble();
		double suaMeida = aluno1.media();
		
		System.out.printf("Sua media é %.1f\n", suaMeida);
		
		

	}

}
