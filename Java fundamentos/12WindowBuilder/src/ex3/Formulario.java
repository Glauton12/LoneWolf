package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JFrame frame;
	private JTextField txtD1;
	private JTextField txtD2;
	private JTextField txtD3;
	private JTextField txtD4;

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
		frame.setBounds(100, 100, 248, 242);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtD1 = new JTextField();
		txtD1.setBounds(114, 48, 86, 20);
		frame.getContentPane().add(txtD1);
		txtD1.setColumns(10);
		
		txtD2 = new JTextField();
		txtD2.setBounds(114, 76, 86, 20);
		frame.getContentPane().add(txtD2);
		txtD2.setColumns(10);
		
		txtD3 = new JTextField();
		txtD3.setBounds(114, 107, 86, 20);
		frame.getContentPane().add(txtD3);
		txtD3.setColumns(10);
		
		txtD4 = new JTextField();
		txtD4.setBounds(114, 138, 86, 20);
		frame.getContentPane().add(txtD4);
		txtD4.setColumns(10);
		
		JLabel lblDi1 = new JLabel("Dimens\u00E3o 1");
		lblDi1.setBounds(12, 51, 83, 14);
		frame.getContentPane().add(lblDi1);
		
		JLabel lblDi2 = new JLabel("Dimens\u00E3o 2");
		lblDi2.setBounds(12, 79, 83, 14);
		frame.getContentPane().add(lblDi2);
		
		JLabel lblDi3 = new JLabel("Dimens\u00E3o 3");
		lblDi3.setBounds(12, 110, 83, 14);
		frame.getContentPane().add(lblDi3);
		
		JLabel lblNewLabel_3 = new JLabel("Dimens\u00E3o 4");
		lblNewLabel_3.setBounds(12, 141, 83, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Informe as 4 dimens\u00F5es");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(33, 23, 166, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnConfirma = new JButton("Confirmar");
		btnConfirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int D1 = Integer.parseInt(txtD1.getText());
				int D2 = Integer.parseInt(txtD2.getText());
				int D3 = Integer.parseInt(txtD3.getText());
				int D4 = Integer.parseInt(txtD4.getText());
				
				//Condicional
				if((D1 == D2) && (D2 == D3) && (D3 == D4)) {
					JOptionPane.showMessageDialog(null, "� um quadrado");
				}else {
					JOptionPane.showMessageDialog(null, "N�o � um quadrado");
				}
				
			}
		});
		btnConfirma.setBounds(69, 169, 89, 23);
		frame.getContentPane().add(btnConfirma);
	}
}
