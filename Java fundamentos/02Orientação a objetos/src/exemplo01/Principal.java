package exemplo01;

public class Principal {
	
	public static void main(String[]args) {
		
		//intanciar um objeto
		Pessoa objeto = new Pessoa();
		objeto.obterDados();
		
		System.out.println(objeto.calculo());
		System.out.println(objeto.situacao());
		
		
	}
	

}
