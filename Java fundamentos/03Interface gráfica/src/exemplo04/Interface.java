package exemplo04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface {

	//Método de formulário
	public void formulario() {
		
		JFrame f = new JFrame();
		f.setSize(530, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		JLabel rotuloNome = new JLabel("Informe seu nome");
		rotuloNome.setBounds(50, 50, 200, 20);
		JLabel rotuloPeso = new JLabel("Peso");
		rotuloPeso.setBounds(50, 90, 200, 20);
		JLabel rotuloAltura = new JLabel("Altura");
		rotuloAltura.setBounds(50, 130, 200, 20);
		JLabel rotuloResposta = new JLabel();
		rotuloResposta.setBounds(10, 220, 530, 20);

		JTextField campoNome = new JTextField();
		campoNome.setBounds(180, 50, 290, 20);
		JTextField campoPeso = new JTextField();
		campoPeso.setBounds(180, 90, 290, 20);
		JTextField campoAltura = new JTextField();
		campoAltura.setBounds(180, 130, 290, 20);
		
		JButton botao = new JButton("Verificar");
		botao.setBounds(180, 170, 150, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = campoNome.getText();
				double peso = Double.parseDouble(campoPeso.getText());
				double altura = Double.parseDouble(campoAltura.getText());
				
				Pessoa obj = new Pessoa();
				obj.setNome(nome);
				obj.setPeso(peso);
				obj.setAltura(altura);
				
				rotuloResposta.setText(obj.resposta());
				
			}
		});
		
		f.add(rotuloNome);
		f.add(rotuloPeso);
		f.add(rotuloAltura);
		f.add(rotuloResposta);
		f.add(campoNome);
		f.add(campoPeso);
		f.add(campoAltura);
		f.add(botao);
		
		f.setVisible(true);
	}
	
}