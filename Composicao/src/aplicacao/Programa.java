package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.Departamento;
import entidade.HorasContratadas;
import entidade.Trabalhador;
import entidade.enums.TrabalhadorNivel;


public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		
		
		System.out.println("Entre com o departamento : ");
		String departamentoNome = sc.nextLine();
		System.out.println("Ddos do trabalhador: ");
		System.out.println("Nome: ");
		String trabalhadorNome = sc.nextLine();
		System.out.println("Nivel: ");
		String nivel = sc.nextLine();
		System.out.println("Salario: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador trabalho = new Trabalhador(trabalhadorNome, TrabalhadorNivel.valueOf(nivel), salarioBase, new Departamento(departamentoNome));
		System.out.println("Quantos Contratos o trabalahdor terá ? ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			System.out.println("Entre com o contrato # " + i+1 + "Dados");
			System.out.print("Data dd/mm/yyyy ");
			Date contratoData = sdf.parse(sc.next());
			System.out.println("valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.println("Duracao [hora] ");
			int horas = sc.nextInt();
			HorasContratadas contrato = new HorasContratadas(contratoData, valorPorHora, horas);
			trabalho.addContrato(contrato);
		}
		System.out.println();
		System.out.println("Entre com Mes e ano para calcualr o salario [MM/YYYY]");
		
		
	sc.close();	
	}

}
