package exercicio01;

public abstract class Veiculo {
	
	//atributo
	protected double valor;
	
	//IPVA
	protected double ipva  (int ano) {
		double valor = 0;
		
		if(ano == 2019 || ano == 2020) {
			valor = this.valor *0.05;
		}else if(ano == 2018) {
			valor = this.valor *0.07;
		
		}else if(ano == 2015 || ano == 2016 || ano == 2017) {
			valor = this.valor *0.09;
		}else {
			valor = this.valor *0.10;
		}
		
		return valor;
		
	}
	
	
	//Abstrato
	public abstract void retorno();

}
