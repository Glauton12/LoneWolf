package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.ClienteDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(118, 56, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(119, 94, 25, 14);
		contentPane.add(lblCpf);
		
		JLabel lblNascimento = new JLabel("Nascimento");
		lblNascimento.setBounds(103, 138, 55, 14);
		contentPane.add(lblNascimento);
		
		txtNome = new JTextField();
		txtNome.setBounds(174, 53, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(174, 91, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtNascimento = new JTextField();
		txtNascimento.setBounds(174, 135, 86, 20);
		contentPane.add(txtNascimento);
		txtNascimento.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//obter dados
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String nascimento = txtNascimento.getText();
				
				//Executar metodo de cadastro
				ClienteDao cd = new ClienteDao();
				cd.cadastrar(nome);
				cd.cadastrar(cpf);
				cd.cadastrar(nascimento);
				
				
				// Mensagem
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
				
				// Limpar campos
				txtNome.setText("");
				txtCpf.setText("");
				txtNascimento.setText("");
				
			}
		});
		btnCadastrar.setBounds(171, 183, 89, 23);
		contentPane.add(btnCadastrar);
	}
}
