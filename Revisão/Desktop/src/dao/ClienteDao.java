package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import beans.ClienteBeans;
import conexao.Conexao;
import padrao.PadraoCrud;
import padrao.PadraoFiltragem;

public class ClienteDao implements PadraoCrud, PadraoFiltragem {

	public void cadastrar(Object obj) {

		// Obter o OBJ
		ClienteBeans cb = (ClienteBeans) obj;

		// SQL
		String sql = "INSERT INTO clientes VALUES(?,?,?)";

		// Try
		try {
			Conexao.obterConexao();

			PreparedStatement pstmt = Conexao.con.prepareStatement(sql);
			pstmt.setString(1, cb.getCpf());
			pstmt.setString(2, cb.getNome());
			pstmt.setString(3, cb.getNascimento());

			pstmt.execute();

			System.out.println("Cadastro efetuado");
		} catch (Exception e) {
			System.out.println("Falha " + e.getMessage());
		}

	}

	@Override
	public void selecionar() {
		// SQL
		String sql = "SELECT * FROM clientes";

		// Try
		try {
			Conexao.obterConexao();

			Statement stmt = Conexao.con.createStatement();
			
			
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getString(1) + " - " + rs.getString(2));
			}

		} catch (Exception e) {
			System.out.println("Falha ao listar " + e.getMessage());
		}

	}

	@Override
	public void alterar(Object obj) {
		// Obter o OBJ
		ClienteBeans cb = (ClienteBeans) obj;

		// SQL
		String sql = "UPDATE clientes SET nome=?, nascimento=? WHERE cpf=?";

		// Try
		try {
			Conexao.obterConexao();

			PreparedStatement pstmt = Conexao.con.prepareStatement(sql);
			pstmt.setString(1, cb.getNome());
			pstmt.setString(2, cb.getNascimento());
			pstmt.setString(3, cb.getCpf());

			pstmt.execute();

			System.out.println("Alterado com sucesso!");
		} catch (Exception e) {
			System.out.println("Falha ao alterar " + e.getMessage());
		}
	}

	@Override
	public void deletar(String parametro) {
		//SQL
		String sql = "DELETE FROM clientes WHERE cpf=?";
		
		try {
		Conexao.obterConexao();

		PreparedStatement pstmt = Conexao.con.prepareStatement(sql);
		pstmt.setString(1, parametro);
		
		pstmt.execute();
		}catch (Exception e) {
			System.out.println("Erro ao remover "+e.getMessage());
		}
	}

	@Override
	public void filtrarCPF(String cpf) {
		

	}

	@Override
	public void filtrarNome(String nome) {
		

	}

}
