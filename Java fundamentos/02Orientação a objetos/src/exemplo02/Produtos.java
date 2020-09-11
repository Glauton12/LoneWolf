package exemplo02;

import javax.swing.JOptionPane;

public class Produtos {
	
	//Atributos
	private String nome;
	private double valor;
	private double quantidade;
	
	//metodo de onde retorna o valor vezes a quantidade
	public double calculo() {
		return valor * quantidade;
	}
	//metodo de resposta
	private void resposta() {
		System.out.println("O produto"+nome+"foi comprada ao todo"+calculo());
	}
	
	//metodo para obter dados
	public void obterDados() {
		nome=JOptionPane.showInputDialog("Informe o nome do produto");
		valor=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		quantidade=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		
		resposta();
	}
	

}
