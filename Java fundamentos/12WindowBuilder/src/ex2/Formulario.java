package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario {

	private JFrame frame;
	private JTextField txtValor;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox cbxPedido = new JComboBox();
		cbxPedido.setModel(new DefaultComboBoxModel(new String[] {"Pizza                                                  R$12,00", "P\u00E3o de queijo                                     R$4,00", "Macarr\u00E3o                                           R$16,00", "Pastel                                                 R$4.50"}));
		cbxPedido.setBounds(84, 108, 265, 36);
		cbxPedido.setToolTipText("Pizza");
		frame.getContentPane().add(cbxPedido);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// indice do item selecionado
				int pedido = cbxPedido.getSelectedIndex();
				
				//obter o valor adquirido
				double valor = Double.parseDouble(txtValor.getText());
				
				//escolha
				double total = 0;
				
				switch (pedido) {
				case 1: total = valor - 12; break;
				case 2: total = valor - 4; break;
				case 3: total = valor - 16; break;
				case 4: total = valor - 4.5; break;
				}
				
				//total
				if(total < 0) {
					JOptionPane.showMessageDialog(null, "Valor inv�lido");
				}else {
					JOptionPane.showMessageDialog(null, "R$ "+total);
					
				}
				
			}
		});
		btnConfirmar.setBounds(165, 209, 105, 23);
		frame.getContentPane().add(btnConfirmar);
		
		JLabel lblEscolha = new JLabel("Escolha o seu pedido abaixo");
		lblEscolha.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEscolha.setBounds(112, 43, 209, 23);
		frame.getContentPane().add(lblEscolha);
		
		JLabel lblValorPago = new JLabel("Quantidade paga R$:");
		lblValorPago.setBounds(59, 160, 105, 14);
		frame.getContentPane().add(lblValorPago);
		
		txtValor = new JTextField();
		txtValor.setBounds(168, 157, 86, 20);
		frame.getContentPane().add(txtValor);
		txtValor.setColumns(10);
	}
}
