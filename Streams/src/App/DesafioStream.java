package App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import entidade.Produto;

public class DesafioStream {

    public static void main(String[] args) {
        // Criação de objetos do tipo Produto
        Produto p1 = new Produto("Lapiz", 1.99, 0.10, 30.0);
        Produto p2 = new Produto("NotBook", 3400.0, 0.32, 0.0);
        Produto p3 = new Produto("Impressora", 500.0, 0.35, 0.0);
        Produto p4 = new Produto("Iphone", 8000.0, 0.22, 0.0);
        Produto p5 = new Produto("Caderno", 21.99, 0.10, 43.0);
        Produto p6 = new Produto("Ipad", 10343.0, 0.13, 0.0);

        // Criação de uma lista de produtos
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        // Definição de predicados (filtros)
        Predicate<Produto> superPromo = p -> p.getDesconto() >= 0.30;
        Predicate<Produto> freteGratis = p -> p.getValorFrete() == 0.0;
        Predicate<Produto> precoRelevante = p -> p.getPreco() >= 500;

        // Função para formatar a mensagem de promoção
        Function<Produto, String> chamadaPromo = p -> " Aproveite! " + p.getNome() + " POR APENAS R$: " + p.getPreco();

        // Utilização de Java Streams para filtrar, mapear e imprimir produtos promocionais
        produtos.stream()
                .filter(superPromo)        // Se o produto passar pelo Filtro produtos com desconto >= 30%
                .filter(freteGratis)       // Se o produto passar pelo Filtro produtos com frete grátis
                .filter(precoRelevante)    // Se o produto passar pelo Filtro produtos com preço >= 500
                .map(chamadaPromo)         // Mapeia os produtos para mensagens de promoção
                .forEach(System.out::println);//Imprime as mensagens, tambem seria possivel encaminahar
        									// as coisas filtradas para oturo lugar como banco de dados ou listas
    }
}
