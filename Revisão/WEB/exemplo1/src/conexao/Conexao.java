  
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	// Realizar conex�o
	public static Connection obterConexao() throws SQLException, ClassNotFoundException {
		
		// Vari�vel para retornar a conex�o
		Connection con = null;
		
		// Informar o driver de conex�o
		Class.forName("com.mysql.jdbc.Driver");
		
		// Efetuando a conex�o
		con = DriverManager.getConnection("jdbc:mysql://localhost/projeto_web", "root", "160997");
		
		// Retorno
		return con;
	}
		
}