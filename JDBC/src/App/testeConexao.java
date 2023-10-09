package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeConexao {

	public static void main(String[] args)throws SQLException{
		String url = "jdbc:mysql://localhost:3306?verifyservercertificate=false&usessl=true";
		String usuario = "root";
		String senha = "123456";
		Connection conexao = DriverManager.getConnection(url,usuario, senha);
		
		conexao.close();
		System.out.println("Conexao feito com sucesso!");
	}

}
