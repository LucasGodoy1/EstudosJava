package App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entidade.FabricaConexao;
import entidade.Pessoa;

public class consultarPessoas1 {

    public static void main(String[] args) throws SQLException {
        // Este programa realiza uma consulta a uma tabela de pessoas em um banco de dados usando JDBC.
        // A lógica envolve a obtenção de dados, armazenamento em uma lista e exibição dos resultados.

        // Obtém uma conexão com o banco de dados através da classe FabricaConexao.
        Connection cnx = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas"; // Define a consulta SQL.

        // Cria uma declaração SQL para executar a consulta.
        Statement stmt = cnx.createStatement();
        ResultSet resultado = stmt.executeQuery(sql); // Executa a consulta e obtém um ResultSet.

        List<Pessoa> pessoas = new ArrayList<>(); // Inicializa uma lista para armazenar os resultados.

        // Processa os resultados da consulta e preenche a lista de pessoas.
        while (resultado.next()) {
            // Dentro deste loop, estamos iterando sobre os resultados da consulta representados pelo objeto ResultSet.

            int codigo = resultado.getInt("codigo");
            // Aqui, estamos usando o método getInt("codigo") para obter o valor da coluna "codigo" do resultado atual.
            // Isso significa que estamos obtendo o valor do campo "codigo" para a pessoa atual na iteração.

            String nome = resultado.getString("nome");
            // Da mesma forma, estamos usando o método getString("nome") para obter o valor da coluna "nome" do resultado atual.
            // Isso significa que estamos obtendo o valor do campo "nome" para a pessoa atual na iteração.

            pessoas.add(new Pessoa(codigo, nome));
            // Com os valores de "codigo" e "nome" obtidos do resultado da consulta, criamos um novo objeto Pessoa
            // e o adicionamos à lista "pessoas". Isso preenche a lista com objetos Pessoa representando os registros do banco de dados.
        }

        // Exibe os resultados na saída padrão.
        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        stmt.close(); // Fecha a declaração SQL.
    }
}
