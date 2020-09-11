  
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	// Realizar conexão
	public static Connection obterConexao() throws SQLException, ClassNotFoundException {
		
		// Variável para retornar a conexão
		Connection con = null;
		
		// Informar o driver de conexão
		Class.forName("com.mysql.jdbc.Driver");
		
		// Efetuando a conexão
		con = DriverManager.getConnection("jdbc:mysql://localhost/projeto_web", "root", "160997");
		
		// Retorno
		return con;
	}
		
}