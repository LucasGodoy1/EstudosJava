package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class criarBanco {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306?verifyservercertificate=false&usessl=true";
		String usuario = "root";
		String senha = "123456";
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		System.out.println("CONECTADO");
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE curso_java");
		
		System.out.println("banco Criado com sucesso!");
		conexao.close();
		System.out.println("Conexao encerrada...");
		
	}

}
