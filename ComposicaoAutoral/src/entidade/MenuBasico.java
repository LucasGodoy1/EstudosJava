package entidade;

import java.util.Scanner;

public class MenuBasico {
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
	
	

}
