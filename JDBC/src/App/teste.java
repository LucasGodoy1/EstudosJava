package App;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import entidade.FabricaConexao;

public class teste {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println(conexao);
		System.out.println("Conectado");
		
		//Em Java, um Statement é uma interface que faz parte do pacote java.sql. 
		//Ela é usada para executar instruções SQL em um banco de dados.
		Statement stmt = conexao.createStatement();
		
		//abaixo o comando java para criar um banco de dados
		stmt.execute("CREATE DATABASE curso_java2");
		
		System.out.println("BANCO CRIADO!");
		

	}

}
