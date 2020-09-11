package ativadade06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Interface {
	
	//DefaultTableModel
	DefaultTableModel dados = new DefaultTableModel();
	
	//Contrutor
	public Interface() {
		formulario();
	}
	
	//Metodo JFrame
	private void formulario() {
		
		//JFrame
		JFrame f = new JFrame();
		f.setSize(350, 500);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Adicionando Componentes
		f.add(painelCadastro());
		f.add(painelListagem());
		
		//exibir JFrame e demais componentes
		f.setVisible(true);
		
	}
	
	//Painel cadastro
	private JPanel painelCadastro() {
		
		//intanciar um objeto da classe JPanel
		JPanel p = new JPanel();
		p.setBounds(5, 10, 323, 100);
		p.setBorder(BorderFactory.createLineBorder(Color.gray));
		p.setLayout(null);
		
		
		//Componentes 
		JLabel rotuloNome = new JLabel("informe seu nome");
		rotuloNome.setBounds(5, 5, 120, 20);
		JLabel rotuloNota1 = new JLabel("informe sua nota 1");
		rotuloNota1.setBounds(5, 30, 120, 20);
		JLabel rotuloNota2 = new JLabel("informe sua nota 2");
		rotuloNota2.setBounds(5, 55, 120, 20);
		JLabel rotuloMedia = new JLabel();
		rotuloMedia.setBounds(5, 75, 120, 20);
		
		JTextField campoNome = new JTextField();
		campoNome.setBounds(120, 5, 200, 20);
		JTextField campoNota1 = new JTextField();
		campoNota1.setBounds(120, 30, 200, 20);
		JTextField campoNota2 = new JTextField();
		campoNota2.setBounds(120, 55, 200, 20);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(110, 80, 100, 20);
		
		//Evento de clique
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter dados
				String nome = campoNome.getText();
				int nota1 = Integer.parseInt(campoNota1.getText());
				int nota2 = Integer.parseInt(campoNota2.getText());
				
				//média
				double media = (nota1+nota2)/2;
				
				//adicionar no DefaultTableModel
				dados.addRow(new Object[] { nome, nota1, nota2, media});
				
				//Limpar os campos
				campoNome.setText("");
				campoNota1.setText("");
				campoNota2.setText("");
				
				//Mensagem
				JOptionPane.showMessageDialog(null, "Aluno e notas cadastrados com sucesso!");
				
			}
		});
		
	
		//Adicionar componentes ao painel
		p.add(rotuloNome);
		p.add(rotuloNota1);
		p.add(rotuloNota2);
		p.add(campoNome);
		p.add(campoNota1);
		p.add(campoNota2);
		p.add(btnCadastrar);
		p.add(rotuloMedia);
		
		//Retorno
		return p;
	
	}
	
	//Painel de Listagem
	private JPanel painelListagem() {
	
		//Instânciar um objeto da classe JPanel
		JPanel p = new JPanel();
		p.setBounds(5, 130, 323, 126);
		p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		p.setLayout(null);
		
		//Caracteristica do DefaultTableModel
		dados.addColumn("Nome"); 
		dados.addColumn("Nota1");
		dados.addColumn("Nota2");
		dados.addColumn("Media");
		
		//Tabela
		JTable tabela = new JTable(dados);
		
		//ação do mouse
		tabela.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				//Obter a linha da tabela clicada
				int linha = tabela.getSelectedRow();
				
				//Remover Linha Selecionada
				dados.removeRow(linha);

				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//barra de rolagem e cabeçalho
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(0, 0, 323, 126);
		
		// adicionar ao painel
		p.add(barra);
		
		//retorno
		return p;
		
		
		
	
	}

}
