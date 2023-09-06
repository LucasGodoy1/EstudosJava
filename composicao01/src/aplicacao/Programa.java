package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.Ordem;
import entidade.OrdemItem;
import entidade.Produto;
import entidade.nums.OrdemStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entere com os dados do cliente");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Cliente client = new Cliente(name, email, birthDate);
		
		System.out.println("Entre com ordem dados");
		System.out.print("Status: ");
		OrdemStatus status = OrdemStatus.valueOf(sc.next());
		
		Ordem order = new Ordem(new Date(), status, client);
		
		System.out.print("Quantos itens terá? ");
		int N = sc.nextInt();
		for (int i=1; i<=N; i++) {
			System.out.println("Entre #" + i + " item dados:");
			System.out.print("Produto nome: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Produto preco: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();
			
			Produto product = new Produto(productName, productPrice);
			
			OrdemItem it = new OrdemItem(quantity, productPrice, product);
			
			order.addItem(it);			
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
		
		


	}

}
