package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Usuario;
import conexao.Conexao;

public class Acao {
	
	//listar usuarios 
	public static ArrayList<Usuario> listar(){
		
		//Arraylist
		ArrayList<Usuario> dados = new ArrayList<Usuario>();
		
		//sql
		String sql = "SELECT * FROM usuarios";
		
		//Try
		try {
			
			Statement stmt = Conexao.obterConexao().createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Usuario u = new Usuario(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				
				dados.add(u);
			}
			
		}catch(Exception erro) {
			
		}
		
		//Retorno
		return dados;
		
	}
	
	//Cadastrar
	public static void cadastrar(String nome, int idade, String cidade) {
		
		try{
			String sql = "INSERT INTO usuarios (nomeUsuario, idadeUsuario, cidadeUsuario) VALUES (?, ?, ?)";
			
			PreparedStatement pstmt = Conexao.obterConexao().prepareStatement(sql);
			pstmt.setString(1, nome);
			pstmt.setInt(2, idade);
			pstmt.setString(3, cidade);
			
			pstmt.execute();
			
			
		}catch(Exception erro){
			System.out.println(erro.getMessage());
			}
		
	}
	
	//Remover usuario
	public static void remover(int id) {
		
		try{
			String sql = "DELETE FROM usuarios WHERE idUsuario = ?";
			
			PreparedStatement pstmt = Conexao.obterConexao().prepareStatement(sql);
			pstmt.setInt(1, id);
			
			pstmt.execute();
			
			
		}catch(Exception erro){
			System.out.println(erro.getMessage());
			}
		
	}

}











