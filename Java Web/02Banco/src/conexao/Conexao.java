package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	//Realizar conexao
	public static Connection obterConexao() throws SQLException, ClassNotFoundException {
		
		//Variavel para retornar a conexao
		Connection con = null;
		
		//Informar o driver de conexao
		Class.forName("com.mysql.jdbc.Driver");
		
		//Efetuando conexao
		con = DriverManager.getConnection("jdbc:mysql://localhost/jsp01", "root", "160997");
	
		//retorno
		return con;
	}

}
