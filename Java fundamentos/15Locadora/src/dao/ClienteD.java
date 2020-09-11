package dao;

import javax.swing.table.DefaultTableModel;

import bean.ClienteB;
import db.ListaClientes;

public class ClienteD {
	
	//Cadastrar
	public static void cadastrar(ClienteB cliente) {
		ListaClientes.clientes.add(cliente);
	}
	
	//Selecionar
	public static DefaultTableModel selecionar() {
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("Cliente");
		dados.addColumn("Filme");
		dados.addColumn("Data de loca��o");
		dados.addColumn("Data de entrega");
				
	
		
		return dados;
	
	}
	
	//Alterar
	public static void alterar(int linha, ClienteB cliente) {
		ListaClientes.clientes.set(linha, cliente);
	}
	
	//Excluir
	public static void excluir(int linha) {
		ListaClientes.clientes.remove(linha);
	}

}
