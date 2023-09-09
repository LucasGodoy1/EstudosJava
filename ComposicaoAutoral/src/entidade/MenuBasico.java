package entidade;

import java.util.Scanner;

public class MenuBasico extends Conta{
	private Integer escolha;

	public static int menuInicial(int escolha) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("[1] Cadastre-se \n[2] Entrar");
			escolha = sc.nextInt();
			if (escolha == 1) {
				break;
			} else if (escolha == 2) {
				break;
			} else {
				System.out.println("Comando Invalido Use apenas os numeros [1] ou [2]");
				continue;
			}
		}
		return escolha;
	}

	public static void exibirMenu() {
		String[] menu = { "Meus Dados", "Saldo", "Extrato Conta", "Pix", "Transferencia", "Saque", "Limite",
				"Cartoes" };
		System.out.println("-----MENU-----");
		for (int i = 1; i <= 7; i++) {
			System.out.println("[" + i + "]" + "-> [" + menu[i] + "]");
		}
	}

	public static int escolhaMenu(Conta conta, int escolha) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Use Apenas [Numeros] para Entrar");
			escolha = sc.nextInt();
			if (escolha == 1) {
				double saldo = conta.getSaldo();
	            System.out.println("Saldo: " + saldo);
				break;
			} else if (escolha == 2) {
				conta.getExtrato();
				break;
			} else if (escolha == 3) {
				System.out.println("Digite o Valor que deseja R$: ");
				double valor = sc.nextDouble();
				System.out.println("Transferencia aleatoria"); // necessario implementar mais
				conta.removeSaldo(valor); // necessario bloquear transaçoes em caso de  falta de saldo ou limite 
				break;
			} else if (escolha == 4) {
				System.out.println("Digite o Valor que deseja R$: ");
				double valor = sc.nextDouble();
				System.out.println("Transferencia aleatoria"); // necessario implementar mais
				conta.removeSaldo(valor);
				break;
			} else if (escolha == 5) {
				System.out.println("Digite o Valor que deseja R$: ");
				double valor = sc.nextDouble();
				conta.removeSaldo(valor);
				break;
			} else if (escolha == 6) {
				break;
			} else if (escolha == 7) {
				break;
			} else {
				System.out.println("Comando Invalido Use apenas os numeros");
				continue;
			}
		}
		return escolha;
	}

}
