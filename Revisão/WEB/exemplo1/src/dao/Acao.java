package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Clientes;
import conexao.Conexao;

public class Acao {
	
	// Listar Usuários
		public static ArrayList<Clientes> listar(){
			
			// ArrayList
			ArrayList<Clientes> dados = new ArrayList<Clientes>();
			
			// SQL
			String sql = "SELECT * FROM clientes";
			
			// Tentativa
			try {
				
				Statement stmt = Conexao.obterConexao().createStatement();
				
				ResultSet rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					Clientes u = new Clientes(rs.getString(1), 
										    rs.getString(2),
										    rs.getString(3));
					dados.add(u);
				}
				
			}catch(Exception e) {}
			
			// Retorno
			return dados;
			
		}
	
	// Cadastrar usuário
		public static void cadastrar(String nome, String cpf, String nascimento) {
			try{
				String sql = "INSERT INTO clientes (nome, cpf, nascimento) VALUES (?, ?, ?)";
				
				PreparedStatement pstmt = Conexao.obterConexao().prepareStatement(sql);
				pstmt.setString(1, nome);
				pstmt.setString(2, cpf);
				pstmt.setString(3, nascimento);
				
				pstmt.execute();
			}catch(Exception erro){
				System.out.print(erro.getMessage());
			}
	}
		
		// Remover usuário
		public static void remover(String cpf) {
			try{
				String sql = "DELETE FROM clientes WHERE cpf = ?";
				
				PreparedStatement pstmt = Conexao.obterConexao().prepareStatement(sql);
				pstmt.setString(1, cpf);
				
				pstmt.execute();
			}catch(Exception erro){
				System.out.print(erro.getMessage());
			}
		}


}
