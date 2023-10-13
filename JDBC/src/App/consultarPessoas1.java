package App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import entidade.FabricaConexao;

public class consultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		Connection cnx = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas";
		Statement stmt = cnx.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		System.out.println(resultado);
		
		
		
		
		stmt.close();
	}

}
