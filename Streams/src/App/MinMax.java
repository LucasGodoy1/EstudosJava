package App;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import entidade.Aluno;

public class MinMax {

    public static void main(String[] args) {

        // Criando objetos Aluno com nomes e notas
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Joao", 8.1);
        Aluno a3 = new Aluno("maria", 7.2);
        Aluno a4 = new Aluno("luiz", 10.0);

        // Criando uma lista de alunos
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        // Criando um Comparator personalizado para comparar Alunos com base nas notas
        Comparator<Aluno> melhorNota = (al1, al2) -> {
            // Compara as notas dos alunos
            if (al1.getNota() > al2.getNota()) return 1;    // Se al1 tem nota maior, retorna 1 (indicando que al1 é maior)
            if (al2.getNota() > al1.getNota()) return -1;   // Se al2 tem nota maior, retorna -1 (indicando que al2 é maior)
            return 0;                                      // Se as notas são iguais, retorna 0 (indicando que são iguais)
        };

        // Encontra o aluno com a melhor nota usando o método max do Stream
        System.out.println("Aluno com a melhor nota: " + alunos.stream().max(melhorNota).get());

        // Encontra o aluno com a pior nota usando o método min do Stream
        System.out.println("Aluno com a pior nota: " + alunos.stream().min(melhorNota).get());
    }
}
