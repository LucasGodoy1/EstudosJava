package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <Funcionarios> lista = new ArrayList<>();
		
		System.out.println("Quantos Funcionarios serão cadastrados ? ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			
			System.out.println("Funcionario N° " + (i + 1));
			System.out.println("Digite oID");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			Double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id, nome, salario);
			
			lista.add(func);
		}
		
		System.out.println("Digite o ID do funcionario: ");
		int idSalario = sc.nextInt();
		
		Integer pos = temID(lista, idSalario);
		if (pos == null) {
			System.out.println("Id Não existente");
		}else {
			System.out.println("Entre com a porcentagem: ");
			double porcent = sc.nextDouble();
			lista.get(pos).aumentoSalarial(porcent);
		}
		
		
		for (Funcionarios pessoaDaLista : lista) {
			System.out.println(pessoaDaLista);
		}
		
		
		
		
		
		
		sc.close();
	}
	static Integer temID(List<Funcionarios> lista, int id) {
		for (int i = 0 ; i < lista.size();) {
			if (lista.get(i).getId()==id) {
				return i;
			}
			
		}return null;
	}

}
