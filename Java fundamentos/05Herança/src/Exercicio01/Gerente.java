package Exercicio01;

public class Gerente extends impostos {
	
	//Construtor
		public Gerente(double salario) {
			super (salario);
			
			relatorio();
			
		}
		
		// imposto de renda
		private double impostoRenda() {
			return salario *0.1;
		}
	
		//relatorio
		private void relatorio() {
			double salarioLiquido = salario - (valeTransporte()+valeAlimentacao()+impostoRenda()+FGTS());
			
			
			System.out.println("Vale Trasnporte: "+valeTransporte());
			System.out.println("Vale Alimenta��o: "+valeAlimentacao());
			System.out.println("Imposto de Renda: "+impostoRenda());
			System.out.println("FGTS: "+FGTS());
			System.out.println("sal�rio liquido: R$ "+salarioLiquido);
			
		}

}
