package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.Conta;
import entidade.MenuBasico;

public class NakedBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		String email;
		String cep;
		String endereco;

		System.out.println("------NakedBank------");
		System.out.println("[1] Cadastre-se \n[2] Entrar");
		Integer escolha = sc.nextInt();
		if (escolha != 1 && escolha != 2) {
			System.out.println("Comando Invalido");
			escolha = MenuBasico.menuInicial(escolha);
		}else if (escolha ==2) {
			System.out.println(" Serviço em Manutencao !!");
			System.out.println("Tente Novamente Mais Tarde...");
		}

		if (escolha == 1) {
			System.out.println("---Cadastre-se Agora!---");
			System.out.println("E-Mail: ");
			email = sc.next();
			sc.nextLine();
			System.out.println("Nome Completo: ");
			nome = sc.nextLine();
			System.out.println("CEP: ");
			cep = sc.nextLine();
			System.out.println("Endereco: ex: rua tantantan N 200");
			endereco = sc.nextLine();
			
			Cliente dados = new Cliente(email, nome, cep, endereco);
			Conta cliente0 = new Conta(dados);
			System.out.println();
			System.out.println("Deseja fazer um deposito Inicial ?");
			escolha = null;
			System.out.println("[1] Sim \n[2] Nao ");
			escolha = sc.nextInt();
			if (escolha == 1) {
				System.out.println("Valor R$: ");
				Double deposito = sc.nextDouble();
				cliente0.addSaldo(deposito);
			}
			System.out.println();
			System.out.println("---- Conta Criada Com Sucesso! -----");
			System.out.println(cliente0);
			System.out.println();
			escolha = null;
			System.out.println("--Ir para Inicio-- \n[1] Sim \n[2] para sair...");
			escolha = sc.nextInt();
			if (escolha == 1) {
				MenuBasico.exibirMenu();
			}else {System.out.println("Programa encerrado...");}
			
			MenuBasico.escolhaMenu(cliente0, escolha);
					
			while (true) {
			System.out.println("--Voltar para Inicio-- \n[1] Sim \n[2] para sair...");
			escolha = sc.nextInt();
			if (escolha == 1) {
				MenuBasico.exibirMenu();
				MenuBasico.escolhaMenu(cliente0, escolha);
				continue;
			}else {System.out.println("Programa encerrado..."); 
				break;	}
			}
			


		}
		
		


	}

}
