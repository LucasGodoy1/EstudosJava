package App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.FabricaConexao;
import entidade.Pessoa;

public class consultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
        Connection cnx = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?"; 
        
        System.out.println("Informe o Valor para Pesquisa: ");
        String pesquisa = sc.nextLine();
        
        PreparedStatement stmt = cnx.prepareStatement(sql);
        stmt.setString(1, "%" + pesquisa + "%");
        ResultSet resultado = stmt.executeQuery(); 
        List<Pessoa> pessoas = new ArrayList<>(); 
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
             pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        stmt.close();

	}

}
