package Exercicio01;

public class Desenvolvedor extends impostos {
	
	//Construtor
	public Desenvolvedor(double salario) {
		super (salario);
		
		relatorio();
	}
	
	// imposto de renda
	private double impostoRenda() {
		return salario *0.03;
	}
	
	//Relater
	private void relatorio() {
		double salarioLiquido = salario - (valeTransporte()+valeAlimentacao()+impostoRenda()+FGTS());
		
		
		System.out.println("Vale Trasnporte: "+valeTransporte());
		System.out.println("Vale Alimentação: "+valeAlimentacao());
		System.out.println("Imposto de Renda: "+impostoRenda());
		System.out.println("FGTS: "+FGTS());
		System.out.println("salário liquido: R$ "+salarioLiquido);
	}

}
