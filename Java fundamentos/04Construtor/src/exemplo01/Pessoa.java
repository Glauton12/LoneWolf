package exemplo01;

public class Pessoa {
	
	//Construtor
	public Pessoa() {
		System.out.println("Construtor ok!");
	}
	
	//contrutor com parametro nome
	public Pessoa(String nome) {
		System.out.println("boa noite "+nome);
	}
	
	//Contrutor com dois parametros 
	public Pessoa(String nome, int idade) {
		System.out.println("Olá "+nome+", você tem "+idade+" Anos.");
	}

}
