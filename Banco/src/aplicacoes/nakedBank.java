package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entidades.Ultilitarios;

public class nakedBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("----Naked Bank----");
		
		System.out.println("Nome e Sobrenome: ");
		String nome = sc.nextLine().toUpperCase().trim();
		double deposito = 0.00;		
		String agencia = "1550";
		String conta = "1001707-2";
		
		Ultilitarios cliente1 = new Ultilitarios(nome, agencia, conta, deposito);
		
		
		System.out.println("Estamos quase terminando...");
		System.out.println("Deseja fazer um deposito ? S/N");
		String dej = sc.nextLine().toUpperCase().trim().substring(0,1);
		if (dej.equals("S")) {
			System.out.print("Digite o Valor R$: ");
			deposito = sc.nextDouble();
			cliente1.setDeposito(deposito);
			System.out.println("Deposito Feito com sucesso! ");
		}else {
			System.out.println("Obrigado.");
		}
		
		
		
		
		System.out.println(" Conta Aberta!");
		System.out.println(" Dados de sua conta");
		System.out.println(cliente1 );
		
		if (deposito == 0) {
			System.out.println("Faça seu priemiro Deposito");
			System.out.println("[s] / [N]");
			dej = sc.nextLine().toUpperCase().trim().substring(0,1);
			if (dej.equals("S")) {
				System.out.print("Valor R$: ");
						deposito = sc.nextDouble();
						cliente1.setDeposito(deposito);
						System.out.println("-------extrato--------");
						cliente1.extrato();
						
						System.out.println("Faça já seu primeiro saque: ");
						double saque = sc.nextDouble();
						cliente1.setSaque(saque);
					}
		}
		
		if (deposito >= 5.00) {
			System.out.println("Faça já seu primeiro saque: ");
			double saque = sc.nextDouble();
			cliente1.setSaque(saque);
		}
		
		System.out.println("-------extrato--------");
		cliente1.extrato();
		System.out.println("---------------");
		System.out.println("Mude de NOME: ");
		sc.nextLine();
		nome = sc.nextLine().toUpperCase().trim();
		cliente1.setNome(nome);
		System.out.println("Nome Alterado: " + cliente1.getNome());
		
		
		
		
		
		sc.close();
		
		
	}

}
