package App;

import entidade.Aluno;
import entidade.Bolsista;
import entidade.Visitante;

public class Programa {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setIdade(22);
		v1.setNome("Lucas");
		v1.setSexo("Masculino");
		System.out.println(v1);
		Aluno a1 = new Aluno();
		System.out.println("----------------");
		a1.setNome("Joaquin");
		a1.setMatricula(1111);
		a1.setCurso("Informatica");
		a1.setIdade(16);
		a1.setSexo("Masculino");
		a1.pagarMensalidade();
		System.out.println(a1);
		System.out.println("----------------");
		Bolsista b1 = new Bolsista();
		b1.setNome("josé");
		b1.setBolsa(70.5);
		b1.setSexo("Masculino");
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		
		
	

	}

}
