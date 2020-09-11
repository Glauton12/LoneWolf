package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {
	//classe é o molde do seu projeto
	
		//Atributos
		public String nome;
		private int idade;
		private double peso, altura;
		
		//Método de Cálculo de imc
		public double calculo(){
			return peso / (altura * altura);
		}
		
		//Método de situação do IMC
		public String situacao() {
			double valor = calculo ();
			String retorno ="";
			
			if(valor < 17) {
				retorno ="Muito abaixo do peso";
			}else if(valor <= 18.5) {
				retorno = "Abaixo do peso";
			}else if(valor <= 25) {
				retorno="peso normal";
			}else {
				retorno ="Acima do peso";
			}
			return retorno;
			
		}
		
		//Método de resposta
		private void resposta() {
			System.out.println(nome+ "tem o IMC de"+calculo()+"e sua situação é"+situacao());
		}
		
		//Método para obter dados
		public void obterDados() {
			nome=JOptionPane.showInputDialog("Informe seu nome");
			peso= Double.parseDouble(JOptionPane.showInputDialog("informe seu peso"));
			altura= Double.parseDouble(JOptionPane.showInputDialog("informe seu altura"));
			
			resposta();
		}

}
