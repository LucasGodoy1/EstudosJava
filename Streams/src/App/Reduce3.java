package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import entidade.Aluno;
import entidade.Media;

public class Reduce3 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 9.5);
        Aluno a2 = new Aluno("Joao", 7.5);
        Aluno a3 = new Aluno("maria", 5.5);
        Aluno a4 = new Aluno("luiz", 8.5);
        Aluno a5 = new Aluno("Noa", 4.5);
        Aluno a6 = new Aluno("Julia", 6.5);
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        
        Predicate<Aluno> aprovado = a -> a.getNota() >=6.0;
        Function<Aluno, Double> apenasNota = a -> a.getNota();
        BiFunction<Media, Double, Media> calculaMedia = 
        		(media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia =
        		(m1, m2) -> Media.combinar(m1, m2);
        		
        Media media = alunos.stream()
        		.filter(aprovado)
        		.map(apenasNota)
        		.reduce(new Media(), calculaMedia, combinarMedia);
        
        System.out.println("A media do aluno é " + media.getValor());
        
      
        
        

	}

}
