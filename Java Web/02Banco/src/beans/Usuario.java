package beans;

public class Usuario {
	
	//Atributos
	private int id, idade;
	private String nome, cidade;
	
	//Construtor
	public Usuario(int id, String nome, int idade, String cidade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
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
	
	

}
