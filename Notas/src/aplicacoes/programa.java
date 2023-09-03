package aplicacoes;

import java.util.Scanner;

import entidades.Ultilitarios;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ultilitarios aluno = new Ultilitarios();
		System.out.println("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite nota1: ");
		aluno.a = sc.nextDouble();
		System.out.println("Digite nota2: ");
		aluno.b = sc.nextDouble();
		System.out.println("Digite nota3: ");
		aluno.c = sc.nextDouble();
		
		double media = aluno.notaTotal();
		System.out.println("--------DADOS---------");
		System.out.println(aluno);
		if (media >= 60) {System.out.println("Voce passou !");
		} else {System.out.println("Reprovado! ");
			double resto = 60 - media;
			System.out.println("necessario fazer + " + resto);
		
		};
		
		
		
	}

}
