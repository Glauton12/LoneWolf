package Exercicio01;

public class Analista extends impostos {
	
	//Construtor
		public Analista(double salario) {
			super (salario);
			
			relatorio();
		}
		
		// imposto de renda
		private double impostoRenda() {
			return salario *0.06;
		}
		
		//relatorio
		private void relatorio() {
			double salarioLiquido = salario - (valeTransporte()+valeAlimentacao()+impostoRenda()+FGTS());
			
			
			System.out.println("Vale Trasnporte: "+valeTransporte());
			System.out.println("Vale Alimentação: "+valeAlimentacao());
			System.out.println("Imposto de Renda: "+impostoRenda());
			System.out.println("FGTS: "+FGTS());
			System.out.println("salário liquido: R$ "+salarioLiquido);
		}

}
