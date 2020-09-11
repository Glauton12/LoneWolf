package pacote;

import java.util.ArrayList;

public class Dados {
	
	// Arraylist
	private ArrayList<String> array = new ArrayList<String>();
	
	//Construtor
	public Dados() {
		array.add("Alessandra");
		array.add("Bruna");
		array.add("Cristiano");
		array.add("Danilo");
		array.add("Elaine");
		array.add("Fátima");
		array.add("Gisele");
		array.add("Henrique");
	}
	
	//retornar array
	public ArrayList<String> retorno(){
		return array;
	}
	
	//

}
