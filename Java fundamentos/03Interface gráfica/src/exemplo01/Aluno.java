package exemplo01;

public class Aluno {
	
	//Atributos
	private String nome;
	private double nota1, nota2;
	
	//get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	//Calculo de média
	private double calculo() {
		return (nota1+nota2)/2;
	}
	
	//Situação
	private String situacao() {
		return calculo() >=7? "Aprovado" : "Reprovado";
	}
	
	//Resposta
	public String resposta() {
		return "O aluno "+nome+" obteve média "+calculo()+", e sua situação é "+situacao();
	}

	
	
}
