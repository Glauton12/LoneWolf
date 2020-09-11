package ex04;

public class Principal {

	public static void main(String[] args) {
		
		//Inst�nciar um objeto
		Produto p = new Produto();
		p.setNome("Monitor da Dell");
		p.setTipo("inform�tica");
		p.setValor(1000);
		p.mensagem();
		
		/*
		 *  ENCAPSULAMENTO: Visibilidade de atributos e m�todos
		 *  default:   exibir atributos e m�todos apenas se as classes estiverem no mesmo pacote
		 *  public:    Os atributos e m�todos estaram visiveis em qualquer lugar
		 *  private:   Atributos e m�todos visiveis apenas nas classes onde s�o criados.
		 *  protected: Atributos e m�todos visiveis na classe onde s�o criados ou herdados.
		 */

	}

}
