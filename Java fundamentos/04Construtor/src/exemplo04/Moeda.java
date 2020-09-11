package exemplo04;

import javax.swing.JOptionPane;

public class Moeda {
	
	//Atributos
	private double valor;
	private int conversao;
	
	//Construtor
	public Moeda() {
			perguntas();
			resultado();
	}
	
	//Perguntas
	private void perguntas() {
			valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor que deseja converter"));
			conversao = Integer.parseInt(JOptionPane.showInputDialog("1)Real para D�lar \n2)D�lar para real \n3)Real para euro \n4)Euro para real"));
		
	}
	
	//Real para dolar
	private double realDolar() {
		return valor / 5.30;
	}
	
	//Dolar para real
	private double dolarReal() {
		return valor * 5.30;
	}
	
	//real para euro
	private double realEuro() {
		return valor / 6;
		
	}
	
	//Euro para Real
	private double euroReal() {
		return valor * 6;
		
	}
	
	//resultado
	private void resultado() {
		String frase = "A convers�o ser� de : ";
		
		switch (conversao) {
		case 1:
			frase+=realDolar();
		break;
		
		case 2:
			frase+=dolarReal();
		break;
		
		case 3:
			frase+=realEuro();
		break;
		
		case 4:
			frase+=euroReal();
		break;
		}
		
		JOptionPane.showMessageDialog(null, frase);
		
	}

}
