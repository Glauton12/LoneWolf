package Exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Verificar loop
		int loop;
		
		//Lace
		do {
			//
			int cargo = Integer.parseInt(JOptionPane.showInputDialog("1)Desenvolvedor/n2)Analista/n3)Gerente"));
			double salario = Double.parseDouble(JOptionPane.showInputDialog("informe o salario"));
			
			switch(cargo) {
			case 1:
				Desenvolvedor d = new Desenvolvedor(salario);
			break;
			
			case 2:
				Analista a = new Analista(salario);
			break;
			
			case 3:	
				Gerente g = new Gerente(salario);
			break;
				
			}
			
			loop = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(loop == 0);
			
		
		

	}

}
