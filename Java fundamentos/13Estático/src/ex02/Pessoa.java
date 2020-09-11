package ex02;

public class Pessoa {
	
	//Contador
	public static int contador = 0;
	
	//Construtor
	public Pessoa() {
		contador++;
		System.out.println(contador);
	}

}
