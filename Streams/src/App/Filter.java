package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import entidade.Aluno;

public class Filter {

    public static void main(String[] args) {
        // Criação de objetos Aluno
        Aluno a1 = new Aluno("Ana", 9.5);
        Aluno a2 = new Aluno("Joao", 7.5);
        Aluno a3 = new Aluno("maria", 5.5);
        Aluno a4 = new Aluno("luiz", 8.5);
        Aluno a5 = new Aluno("Noa", 4.5);
        Aluno a6 = new Aluno("Julia", 6.5);

        // Coloca os objetos Aluno em uma lista
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        // Usando Stream para filtrar e mapear alunos aprovados e imprimir uma mensagem
        alunos.stream()
            .filter(a -> a.getNota() >= 6) // Filtra alunos com nota maior ou igual a 6
            .map(a -> a.getNome() + " Parabens Voce foi APROVADO!") // Mapeia para mensagens de aprovação
            .forEach(System.out::println); // Imprime cada mensagem

        // Definindo um Predicate para verificar se um aluno está aprovado
        Predicate<Aluno> aprovado = a -> a.getNota() >= 6;
        // Definindo uma Function para criar mensagens de aprovação
        Function<Aluno, String> saudacao =
            a -> "Parabens Voce foi APROVADO " + a.getNome();

        // Usando Stream novamente com Predicate e Function para filtrar e mapear alunos aprovados
        alunos.stream()
            .filter(aprovado) // Filtra alunos com base no Predicate
            .map(saudacao) // Mapeia para mensagens de aprovação com base na Function
            .forEach(System.out::println); // Imprime cada mensagem
    }
}
