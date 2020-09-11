package ex07;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Arraylist
		ArrayList<Produto> dados = new ArrayList<Produto>();
		
		//Variavel
		int continuar =0;
		String menu = "1)Cadastrar\n2)Selecionar\n3)Alterar\n4)Excluir";
		
		//Laço
		do {
			
			//Obter a acão 
			int acao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(acao) {
			case 1:
				String nome = JOptionPane.showInputDialog("Informe o nome do produto");
				String marca = JOptionPane.showInputDialog("Informe a marca do produto");
				double valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do produto"));
				
				Produto p = new Produto();
				p.setNome(nome);
				p.setMarca(marca);
				p.setValor(valor);
				
				dados.add(p);
				
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
			break;
			case 2:
				String lista = "";
				
				for(Produto obj : dados) {
					lista += obj.exibir();
				}
				
				JOptionPane.showMessageDialog(null, lista);
				
			break;
			case 3:
				
			break;
			case 4:
				int indice = Integer.parseInt(JOptionPane.showInputDialog("Informe qual indice deseja remover!"));
				dados.remove(indice);
				
				JOptionPane.showMessageDialog(null, "Excluir");
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				
				
			}
			
			//Verificar se deseja continuar
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Título", JOptionPane.YES_NO_OPTION);
			
			}while (continuar == 0);

	}

}
