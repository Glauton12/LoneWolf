package exemplo01;

public abstract class Conta {

	//métodos obrigatorios
	public abstract double emprestimo(double salario);
	public abstract double investimentos(double valor, String tipo);
	
	
	//metodo opcional
	public boolean validaLogin(int agencia, double conta){
		return true;
	}
}
