package ex06;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//arraylist
		ArrayList<Pessoa> dados = new ArrayList<Pessoa>();
		
		//Variável
		int continuar = 0;
		String menu = "1)Cadastrar\n2)Selecionar\n3)Excluir";
		
		//laço
		do {
			
			//Obter a ação
			int acao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(acao) {
			case 1:
				String nome = JOptionPane.showInputDialog("informe seu nome");
				String cidade = JOptionPane.showInputDialog("informe sua cidade");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCidade(cidade);
				p.setIdade(idade);
				
				dados.add(p);
				
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			break;
			case 2:
				String lista = "";
				
				for(Pessoa obj : dados) {
					lista += obj.exibir();
				}
				
				JOptionPane.showMessageDialog(null, lista);
				
			break;
			case 3:
				int indice = Integer.parseInt(JOptionPane.showInputDialog("informe o indice que deseja remover"));
				dados.remove(indice);
				
				JOptionPane.showMessageDialog(null, "EXCLUIR");
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			
			}
			
			//verificar se deseja continuar
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Título", JOptionPane.YES_NO_OPTION);
		}while (continuar == 0);
		

	}

}
