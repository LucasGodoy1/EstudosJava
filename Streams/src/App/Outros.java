package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import entidade.Aluno;

public class Outros {

    public static void main(String[] args) {
        
        // Criando objetos Aluno com nomes e notas
        Aluno a1 = new Aluno("Ana", 9.5);
        Aluno a2 = new Aluno("Joao", 7.5);
        Aluno a3 = new Aluno("maria", 5.5);
        Aluno a4 = new Aluno("luiz", 8.5);
        Aluno a5 = new Aluno("Ana", 9.5);  // Alunos com nomes e notas iguais aos anteriores
        Aluno a6 = new Aluno("Joao", 7.5);
        Aluno a7 = new Aluno("maria", 5.5);
        Aluno a8 = new Aluno("luiz", 8.5);
        Aluno a9 = new Aluno("Pedro", 5.5);
        Aluno a10 = new Aluno("Lucas", 8.5);
        
        // Criando uma lista de alunos
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        
        // Usando distinct para obter elementos únicos (baseados no equals dos objetos)
        // necessario ter o metodo de comparação equals no objeto para funcionar
        System.out.println("distinct ");
        alunos.stream().distinct().forEach(System.out::println);
        
        // Usando skip e limit para pular elementos e limitar a quantidade de elementos
        System.out.println("\nSkip/Limite ");
        alunos.stream()
            .distinct()
            .skip(2)   // Pula os dois primeiros elementos únicos
            .limit(3) // Limita a três elementos após pular
            .forEach(System.out::println);
        
        // Usando takeWhile para pegar elementos até que uma condição seja falsa
        System.out.println("\nTake/While ");
        alunos.stream()
            .distinct()
            .takeWhile(a -> a.getNota() >= 7)// Pega alunos enquanto a nota for maior ou igual a 7 ele deixa de pegar se encontrar alguem menor que 7
            .forEach(System.out::println);
    }
}
