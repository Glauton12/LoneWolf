package exemplo04;

public class Pessoa {
	
	// Atributos
	private String nome;
	private double peso, altura;
	
	// Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Cálculo de média
	private double calculo() {
		return peso/(altura*altura);
	}

	//Situação
	private String situacao() {
		double valor = calculo();
		String retorno = "";
		
		if(valor < 17) {
			retorno = "Muito abaixo do peso";
		}else if(valor <= 18.5) {
			retorno = "Abaixo do peso";
		}else if(valor <= 25) {
			retorno = "Peso normal";
		}else {
			retorno = "Acima do peso";
		}
		
		return retorno;
	}
	
	//Resposta
	public String resposta() {
		return "O paciente "+nome+" têm o IMC de "+calculo()+", e sua situação é "+situacao();
	}
	
}





