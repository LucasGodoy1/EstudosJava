package App;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import entidade.FabricaConexao;

public class criarTabelaPessoas {

	public static void main(String[] args) throws SQLException {
		//antes de criar um statement é necessario criar uma conexao
		//e nesse caso estou chamando o metodo que faz a conexao com o database
		Connection ctn = FabricaConexao.getConexao();
		
		//ao criar uma variavel do tipo statement ela terá que receber a variavel que
		// contem o metodo de se conectar, e entao estanciar como create statement
		//com isso será possivel chamar o metodo de execução de comandos sql
		Statement stmt = ctn.createStatement();
		
		//criado uma variavel com todos os comandos para simplificar o codigo ao executar abaixo
		String sql = "CREATE TABLE IF NOT EXISTS pessoas("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR (80) NOT NULL"
				+ ")";
		
		stmt.execute(sql);
		
		
		System.out.println("Tabela criada com sucesso!");
		ctn.close();

	}

}
