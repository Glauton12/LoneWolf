package ex06;

public class Pessoa {
	
	//Atributos
	private String nome, cidade;
	private int idade;
	
	//Set e get
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Método para exibir dados
	public String exibir() {
		return nome+" - "+cidade+" - "+idade+"\n";
	}
	
	

}
