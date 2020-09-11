package ex04;

public class Principal {

	public static void main(String[] args) {
		
		//Instânciar um objeto
		Produto p = new Produto();
		p.setNome("Monitor da Dell");
		p.setTipo("informática");
		p.setValor(1000);
		p.mensagem();
		
		/*
		 *  ENCAPSULAMENTO: Visibilidade de atributos e métodos
		 *  default:   exibir atributos e métodos apenas se as classes estiverem no mesmo pacote
		 *  public:    Os atributos e métodos estaram visiveis em qualquer lugar
		 *  private:   Atributos e métodos visiveis apenas nas classes onde são criados.
		 *  protected: Atributos e métodos visiveis na classe onde são criados ou herdados.
		 */

	}

}
