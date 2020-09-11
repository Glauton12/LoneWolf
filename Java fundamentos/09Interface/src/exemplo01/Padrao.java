package exemplo01;

public interface Padrao {
	
	/*Classe abstrata:Contêm métodos obrigatórios, onde classe que herdam a classe abtrata precisam seguir.
	 * em uma classe abstrata vc pode criar metodos não abstratos para que sejam reutilizados.
	 * Classes abstratas podem ser herdadas apenas um por classe.
	 * 
	 * Interface:Contêm métodos obrigatórios, onde as classes "herdam".
	 * não podemos criar metodos não reutizaveis
	 * Interfaces podem ser herdadas multiplas vezes pelas classes
	 */

	//Métodos
	public boolean validaUsuario(String email, String senha);
	public void alterarSenha(String senha, String novaSenha);
	public void listarProdutos();
	
}
