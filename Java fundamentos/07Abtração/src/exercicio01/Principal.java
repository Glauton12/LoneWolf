package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//verificar o tipo de veiculo
		int tipo = JOptionPane.showConfirmDialog(null, "� um carro?");
		
		//condicional
		if(tipo == 0) {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
			int quantidadePortas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Portas"));
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
			String cambio = JOptionPane.showInputDialog("C�mbio");
		
		Veiculo v = new Carro(valor, quantidadePortas, ano, cambio);
			
		}else {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
			int potencia = Integer.parseInt(JOptionPane.showInputDialog("Pot�ncia"));
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
			
			Veiculo v = new Moto(valor, potencia, ano);
		}
	}

}
