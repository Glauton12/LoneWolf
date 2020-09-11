package Exercicio01;

public class impostos {
	
	//Attribute
	protected double salario;
	
	//Constructor
	public impostos(double salario) {
		this.salario = salario;
		
	}

	//vale transport
	protected double valeTransporte() {
		return salario * 0.06;
	}
	
	//vale reefs   
	protected double valeAlimentacao() {
		return salario * 0.05;
	}
	
	// FGTS
		protected double FGTS() {
			return salario *0.06;
		}
}
