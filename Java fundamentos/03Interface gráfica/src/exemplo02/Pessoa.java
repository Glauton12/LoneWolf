package exemplo02;

public class Pessoa {
	
	private String nome;
	private double peso, altura;
	
	// get and set
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
	
	//calculo
	private double calculo() {
		return (peso+altura)/2;
	}
	
	//situação
	private String situacao() {
		return calculo() >=70? "Acima do peso" : "Abaixo do peso";
	}

	//resposta
	public String resposta() {
		return "A pessoa "+nome+" está"+calculo()+", e está "+situacao();
	}
	
}
