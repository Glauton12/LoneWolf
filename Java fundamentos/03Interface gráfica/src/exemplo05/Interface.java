package exemplo05;

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
	
	// DefaultTableModel
	DefaultTableModel dados = new DefaultTableModel();
	
	// Construtor
	public Interface() {
		formulario();
	}

	// Método JFrame
	private void formulario() {
		
		// JFrame
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Adicionando componentes
		f.add(painelCadastro());
		f.add(painelListagem());
		
		// Exibir JFrame e demais componentes
		f.setVisible(true);
		
	}
	
	// Painel de cadastro
	private JPanel painelCadastro() {
		
		// Instânciar um objeto da classe JPanel
		JPanel p = new JPanel();
		p.setBounds(5, 5, 323, 100);
		p.setBorder(BorderFactory.createLineBorder(Color.gray));
		p.setLayout(null);
		
		// Componentes
		JLabel rotuloNome = new JLabel("Informe seu nome");
		rotuloNome.setBounds(5, 5, 120, 20);
		JLabel rotuloIdade = new JLabel("Informe sua idade");
		rotuloIdade.setBounds(5, 35, 120, 20);

		JTextField campoNome = new JTextField();
		campoNome.setBounds(120, 5, 200, 20);
		JTextField campoIdade = new JTextField();
		campoIdade.setBounds(120, 35, 200, 20);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(110, 70, 100, 20);
		
		// Evento de clique
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Obter os dados
				String nome = campoNome.getText();
				int idade = Integer.parseInt(campoIdade.getText());
				
				// Adicionar no DefaultTableModel
				dados.addRow(new Object[] { nome, idade });
				
				// Limpar os campos
				campoNome.setText("");
				campoIdade.setText("");
				
				// Mensagem
				JOptionPane.showMessageDialog(null, "Contato cadastrado");
				
			}
		});
		
		// Adicionar componentes ao painel
		p.add(rotuloNome);
		p.add(rotuloIdade);
		p.add(campoNome);
		p.add(campoIdade);
		p.add(btnCadastrar);
		
		// Retorno
		return p;
		
	}
	
	// Painel de listagem
	private JPanel painelListagem() {
		
		// Instânciar um objeto da classe JPanel
		JPanel p = new JPanel();
		p.setBounds(5, 130, 323, 126);
		p.setBorder(BorderFactory.createLineBorder(Color.gray));
		p.setLayout(null);
		
		// Característica do DefaultTableModel
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		
		// Tabela
		JTable tabela = new JTable(dados);
		
		//Ação de mouse
		tabela.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				//Obter a linah da tabela clicada
				int linha = tabela.getSelectedRow();
				
				//Remover linha selecionada
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
		
		// Barra de rolagem e cabeçalho
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(0, 0, 323, 126);
		
		// Adicionar ao painel
		p.add(barra);
		
		// Retorno
		return p;
		
	}

		
}






