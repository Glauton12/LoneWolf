package exemplo03;

import javax.swing.JOptionPane;

public class Numeros {
	
	//Array
	private int[][] numeros = new int[3][3];
	
	//Construtor
	public Numeros() {
		armazenar();
		
		System.out.println(soma());
		exibir();
		
	}
	
	//Armazenar numeros 
	private void armazenar() {
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				String mensagem = "linha: "+(linha+1);
				       mensagem = "\ncoluna: "+(coluna+1);
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			}
		}
		
	}
	
	//somar todos os valores do array
	private int soma() {
		
		//soma
		int soma = 0;
		
		//laço
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				soma += numeros[linha][coluna];
			}
		}
	//retorno
	return soma;
		
	}
	
	//exibir array
	private void exibir() {
		
		//laço
		for(int linha=0; linha<3; linha++) {
			System.out.println();
			for(int coluna=0; coluna<3; coluna++) {
				System.out.print(numeros[linha][coluna]+" ");
			}
		}
		
	}
	

}
