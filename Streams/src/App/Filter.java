package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import entidade.Aluno;

public class Filter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 9.5);
		Aluno a2 = new Aluno("Joao", 7.5);
		Aluno a3 = new Aluno("maria", 5.5);
		Aluno a4 = new Aluno("luiz", 8.5);
		Aluno a5 = new Aluno("Noa", 4.5);
		Aluno a6 = new Aluno("Julia", 6.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		alunos.stream()
		.filter(a -> a.getNota() >= 6)
		.map(a -> a.getNome() + " Parabens Voce foi APROVADO!")
		.forEach(System.out::println);
		
		Predicate<Aluno> aprovado = a -> a.getNota() >= 6;
		Function<Aluno, String> saudacao =
				a -> "Parabens Voce foi APROVADO " + a.getNome();
				
				System.out.println("----------------------------");
		
				alunos.stream()
				.filter(aprovado)
				.map(saudacao)
				.forEach(System.out::println);		
				

	}

}
