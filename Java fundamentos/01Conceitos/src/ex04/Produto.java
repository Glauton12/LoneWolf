package ex04;

public class Produto {
	
	//Atributos
	private String nome, tipo;
	private double valor;
	

	// Imposto municipal
	private double impostoMunicipal() {
		double imposto = 0;
		
		switch(tipo) {
			case "telefonia":
				imposto = valor * 0.5;
			
			break;
			
			case "informática":
				imposto = valor * 0.10;
			
			break;
			
			default:
			imposto =valor * 0.15;
		}
		
		return imposto;
	}

	// Imposto Estadual
	private double impostoEstadual() {
		double imposto = 0;
		
		switch(tipo) {
			case "telefonia":
				imposto = valor * 0.15;
			
			break;
			
			case "informática":
				imposto = valor * 0.20;
			
			break;
			
			default:
			imposto =valor * 0.25;
		}
		
		
		return imposto;
	}

	
	//gerar o valor final
	private double valorFinal() {
		double total = valor + impostoEstadual() + impostoMunicipal();
		
		return total;
	}

	//exibir dados
	public void mensagem( ) {
		System.out.println("O valor do produto "+nome.toUpperCase()+" final será de: R$ "+valorFinal());
		System.out.println("Imposto municipal: "+impostoMunicipal());
		System.out.println("Imposto estadual: "+impostoEstadual());
	}
	
	//métodos mágicos
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
}
