package aplicacao;

import java.util.Scanner;

import entidade.Salario;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salario sal = new Salario();
		System.out.println("Nome: ");
		sal.nomeFuncionario = sc.nextLine();
		System.out.println("Salario Bruto: ");
		sal.salarioBruto = sc.nextDouble();
		System.out.println("---------------");
		
		
		System.out.println(sal);
		
		System.out.println("Qual a porcentagem que deseja adicioanr? ");
		double addPorcentagem = sc.nextDouble();
		sal.addMaiSalario(addPorcentagem);
		System.out.println("---------------");
		System.out.println("Dados Atualizados: ");
		System.out.println(sal);

	}

}
