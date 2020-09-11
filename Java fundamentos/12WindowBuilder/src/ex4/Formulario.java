package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario {

	private JFrame frame;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 305, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe dois numeros");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(67, 26, 154, 34);
		frame.getContentPane().add(lblNewLabel);
		
		txtN1 = new JTextField();
		txtN1.setBounds(101, 71, 86, 20);
		frame.getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(101, 102, 86, 20);
		frame.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JComboBox cbx = new JComboBox();
		cbx.setModel(new DefaultComboBoxModel(new String[] {"Soma", "Subtra\u00E7\u00E3o", "Divis\u00E3o", "Multiplica\u00E7\u00E3o"}));
		cbx.setBounds(67, 178, 154, 22);
		frame.getContentPane().add(cbx);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione a Conta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(83, 153, 122, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnviar.setBounds(98, 227, 89, 23);
		frame.getContentPane().add(btnEnviar);
	}

}
