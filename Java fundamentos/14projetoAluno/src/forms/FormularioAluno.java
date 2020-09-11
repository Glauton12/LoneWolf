package forms;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bean.AlunoB;
import dao.AlunoD;
import db.ListaAlunos;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class FormularioAluno extends JFrame {

	//Atributos
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTable table;
	private int linhaSelecionada;

	/**
	 * Create the frame.
	 */
	//Construtor
	public FormularioAluno() {
		
		//JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNota1.setBounds(10, 49, 58, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNota2.setBounds(209, 49, 58, 14);
		contentPane.add(lblNota2);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 10, 340, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(66, 48, 133, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(261, 48, 145, 20);
		contentPane.add(txtNota2);
		
		//Botões
		JButton btnCancelar = new JButton("Cancelar");
		JButton btnExcluir = new JButton("Excluir");
		JButton btnAlterar = new JButton("Alterar");
		JButton btnCadastrar = new JButton("Cadastrar");
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Obter os dados
				String nome = txtNome.getText();
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				
				//Instanciar um obj da classe alunoB
				AlunoB ab = new AlunoB();
				ab.setNome(nome);
				ab.setNota1(nota1);
				ab.setNota2(nota2);
				
				//chamar metodo de cadastro da classe alunoD
				AlunoD.cadastrar(ab);
				
				//atualizar a tabela
				table.setModel(AlunoD.selecionar());
				
				//limpar
				limpar();
				
				//mensagem
				JOptionPane.showMessageDialog(null, "Aluno cadastrado");
				
				//Listar alunos cadastrados
				/*for (AlunoB a : ListaAlunos.alunos) {
					System.out.println(a.getNome());
				}
				System.out.println("-----------------------------");*/
				
			}
		});
		btnCadastrar.setBounds(10, 74, 89, 23);
		contentPane.add(btnCadastrar);
		
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(110, 74, 89, 23);
		contentPane.add(btnAlterar);
		btnAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Obter os dados
				String nome = txtNome.getText();
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				
				// Instanciar um objeto da classe AlunoB
				AlunoB ab = new AlunoB();
				ab.setNome(nome);
				ab.setNota1(nota1);
				ab.setNota2(nota2);
				
				//Alterar do arraylist
				AlunoD.alterar(linhaSelecionada, ab);
				
				//Atualizar tabela
				table.setModel(AlunoD.selecionar());
				
				//Limpar campos
				limpar();
				
				// Habilitar botão cadastrar
				btnCadastrar.setEnabled(true);
				
				// Desabilitar os bõtoes: alterar, excluir e cancelar
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
				//Mensagem
				JOptionPane.showMessageDialog(null, "Aluno alterado");
				
			}
		});
		
		
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(219, 74, 89, 23);
		contentPane.add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Excluir do arraylist
				AlunoD.excluir(linhaSelecionada);
				
				//Atualizar tabela
				table.setModel(AlunoD.selecionar());
				
				//Limpar campos
				limpar();
				
				//Remover todos os dados da tabela
				table.removeAll();
				
				//habilitar botão  cadastrar
				btnCadastrar.setEnabled(true);
				
				//Desabilitar botão cadastrar
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
				//mensagem
				JOptionPane.showMessageDialog(null, "Removido com sucesso");
			}
		});
	
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(317, 74, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Habilitar botão cadastrar
				btnCadastrar.setEnabled(true);
				
				//Desabilitar botão cadastrar
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
				//limpar
				limpar();
				
				// Mensagem
				JOptionPane.showMessageDialog(null, "Ação cancelada");
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 108, 398, 243);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//linha selecionada
				linhaSelecionada = table.getSelectedRow();
				
				//campos de texto
				txtNome.setText(table.getValueAt(linhaSelecionada, 0).toString());
				txtNota1.setText(table.getValueAt(linhaSelecionada, 1).toString());
				txtNota2.setText(table.getValueAt(linhaSelecionada, 2).toString());
				
				//Desabilitar botão cadastrar
				btnCadastrar.setEnabled(false);
				
				//Desabilitar botão cadastrar
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);
				
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
	}
	
	//limpar campos
	private void limpar() {
		txtNome.setText("");
		txtNota1.setText("");
		txtNota2.setText("");
		
	}
	
}
