package ex07;

public class Produto {
	
	//Atributos
	private String nome, marca;
	private double valor;
	public String getNome() {
		return nome;
	}
	
	//Getters and setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//Exibir dados
	public String exibir() {
		return nome+" - "+marca+" - "+valor+"\n";
	}
}
