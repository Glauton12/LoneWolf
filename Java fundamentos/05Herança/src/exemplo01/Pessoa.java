package exemplo01;

public class Pessoa {
	
	//Atributos
	protected String nome, endereco;
	protected int idade;
	
	//Construtor
	public Pessoa(String nome, String endereco, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
	}
	
	//Listar dados pessoais
	protected void listarP() {
		System.out.println("Nome "+nome);
		System.out.println("Endereço "+endereco);
		System.out.println("Idade "+idade);
	}

}
