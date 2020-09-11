package exercicio01;

public class Carro extends Veiculo{
	
	//Atributos
	private int quantidadePortas, ano;
	private String cambio;
	
	//Construtor
	public Carro(double valor, int quantidadePortas, int ano, String cambio) {
		this.valor=valor;
		this.quantidadePortas= quantidadePortas;
		this.ano=ano;
		this.cambio=cambio;
		
		retorno();
		
	}

	@Override
	public void retorno() {
		System.out.println("IPVA R$"+ipva(ano));
		System.out.println("Quantidade Portas R$"+quantidadePortas());
		System.out.println("Câmbio R$"+cambio());
		
	}
	
	private double quantidadePortas() {
		return quantidadePortas == 2 ? valor * 0.05 : valor *0.08;
	}
	
	private double cambio() {
		return cambio.equals("Automático") ? valor * 0.15 : valor * 0.05;
	}

		
}
