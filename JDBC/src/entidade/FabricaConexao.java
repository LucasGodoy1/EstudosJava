package entidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	private static Object finaly;

	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://localhost/curso_java?verifyservercertificate=false&usessl=true";
			final String usuario = "root";
			final String senha = "123456";
			return DriverManager.getConnection(url, usuario, senha);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
