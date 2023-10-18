package App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import entidade.FabricaConexao;

public class alterarNomePessoa {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o codigo da Pessoa ");
		int codigo = sc.nextInt();
		
		String sql = "SELECT * From pessoas WHERE codigo = ?";
		Connection conect = FabricaConexao.getConexao();
		PreparedStatement stmt = conect.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		
		

		conect.close();
		sc.close();
	}

}
