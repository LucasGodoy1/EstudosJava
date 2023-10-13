package App;
/*  A SQL Injection  é uma vulnerabilidade de segurança comum que ocorre quando dados
 *  não confiáveis ou não validados são incorporados diretamente em uma consulta SQL.
 *  Isso permite que um invasor execute comandos SQL maliciosos no banco de dados, 
 *  o que pode levar a uma série de problemas, incluindo:
 *  Acesso não autorizado,  Vazamento de informações confidenciais, Corrupção de dados, 
 *  Ataques de negação de serviço*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import entidade.FabricaConexao;

public class novaPessoa {

	public static void main(String[] args)throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection ctn = FabricaConexao.getConexao();
		System.out.println("Informe um nome: ");
		String nome = sc.nextLine();
		/* String sql = "INSERT INTO pessoas (nome) "
				+ "VALUES('"+ nome +"')"; não é seguro usar isso com statement*/
		
		 //Criamos o comando SQL com um espaço reservado (placeholder) no lugar do valor.
        // Isso é mais seguro para evitar SQL Injection, pois permite que o valor seja
        // atribuído de forma segura.
        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        // Preparamos o comando SQL usando um PreparedStatement.
        PreparedStatement stmt = ctn.prepareStatement(sql);

        // Atribuímos o id mais o nome ao espaço reservado no Prepar-edStatement.
        stmt.setString(1, nome);
        
        // Atribuímos o id mais o numero ao espaço reservado no PreparedStatement.
        stmt.setInt(2, 100);

        // Executamos o comando SQL de forma segura.
        stmt.execute();
		
        System.out.println("Pessoa incluida com sucesso!");
        
        
		stmt.close();
		sc.close();
	}

}
