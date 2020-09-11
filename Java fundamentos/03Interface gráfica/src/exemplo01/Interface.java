package exemplo01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface {
	
	//método de formnulário
	public void formulario(){
		
		JFrame f=new JFrame();
		f.setSize(400, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		JLabel rotuloNome = new JLabel("Informe seu nome");
		rotuloNome.setBounds(50, 20, 200, 20);
		
		JLabel rotuloNota1 = new JLabel("Informe sua 1° nota");
		rotuloNota1.setBounds(50, 90, 200, 20);
		
		JLabel rotuloNota2 = new JLabel("Informe sua 2° nota");
		rotuloNota2.setBounds(50, 130, 200, 20);
		
		JLabel rotuloResposta = new JLabel();
		rotuloResposta.setBounds(30, 220, 350, 20);
		
		JTextField campoNome = new JTextField();
		campoNome.setBounds(180, 50, 200, 20);
		JTextField campoNota1 = new JTextField();
		campoNota1.setBounds(180, 90, 200, 20);
		JTextField campoNota2 = new JTextField();
		campoNota2.setBounds(180, 130, 200, 20);
		
		JButton botao = new JButton("Calcular");
		botao.setBounds(120, 170, 150, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = campoNome.getText();
				double nota1 = Double.parseDouble(campoNota1.getText());
				double nota2 = Double.parseDouble(campoNota2.getText());
				
				Aluno obj = new Aluno();
				obj.setNome(nome);
				obj.setNota1(nota1);
				obj.setNota2(nota2);
				
				rotuloResposta.setText(obj.resposta());
				
			}
		});
		
		f.add(rotuloNome);
		f.add(rotuloNota1);
		f.add(rotuloNota2);
		f.add(rotuloResposta);
		f.add(campoNome);
		f.add(campoNota1);
		f.add(campoNota2);
		f.add(botao);
		
		f.setVisible(true);
		
		
	}

}
