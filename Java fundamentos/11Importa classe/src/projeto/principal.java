package projeto;

import calculadora.Calculadora;

public class principal {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora(8, 10);
		System.out.println(c.dividir(8, 2));

	}

}
