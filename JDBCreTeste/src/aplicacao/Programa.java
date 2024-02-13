package aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Programa {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost";
        String usuario = "root";
        String senha = "961411";

        Connection conexao = DriverManager.
                getConnection(url,usuario,senha);

        System.out.println("conexao executada com sucesso!");

        conexao.close();

    }
}
