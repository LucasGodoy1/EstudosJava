package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import entidade.Produto;

public class Programa2 {

    public static void main(String[] args) {
        
        // Consumer retorna void
        // Consumer do tipo PRODUTO que é um objeto
        // ele recebe um parâmetro P
        // que irá retornar um print
        Consumer<Produto> printa = p -> System.out.println(p.getNome() + " PROMOCAO!!");
    //interface do tipo poduto recebendo parametro P, E ele sta chamando o P.getNome
        Produto p1 = new Produto("TV", 2300.0, 10.0);
        Produto p2 = new Produto("Som", 300.0, 10.0);
        Produto p3 = new Produto("Iphone", 4300.0, 10.0);
        Produto p4 = new Produto("Notbook", 6300.0, 10.0);
        

        
        // Chamando o método accept do Consumer para imprimir o nome do produto seguido de " ESSE É O NOME!!".
        printa.accept(p1);
        
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
        
        produtos.forEach(printa);
        
        produtos.forEach(p -> System.out.println(p.getPreco()));
        
    }
}
