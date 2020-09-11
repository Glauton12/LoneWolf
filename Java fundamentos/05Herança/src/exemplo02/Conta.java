package exemplo02;

public class Conta {
	
	//Atributos
	protected int agencia, contaCorrente;
	protected double saldo;

	
	//Construtor
	public Conta(int agencia, int contaCorrente, double saldo) {
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
		this.saldo = saldo;
	}

}
