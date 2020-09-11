package ex05;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//lista de bandas
		ArrayList<String> bandas = new ArrayList<String>();
		
		// cadastrar
		bandas.add("Rolling Stones");
		bandas.add("Linkin Park");
		bandas.add("Metallica");
		bandas.add("Red Hot Chilli Peppers");
		bandas.add("Deep Purple");
		bandas.add("Aerosmith");
		bandas.add("Bon Jovi");
		bandas.add("Pearl Jam");
		bandas.add("Foo Fighters");
		bandas.add("Nirvana");
		bandas.add("Pink Floyd");
		bandas.add("The Offspring");

		
		// contar os registros
		System.out.println(bandas.size());
		
		//Alterar dados
		bandas.set(4, "The Who");
		
		//Remover um dado
		bandas.remove(0);
		
		// ForEach
		for (String b : bandas) {
			System.out.println(b);
		}
		
		
	}

}
