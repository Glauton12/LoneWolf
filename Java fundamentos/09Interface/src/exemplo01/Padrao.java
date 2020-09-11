package exemplo01;

public interface Padrao {
	
	/*Classe abstrata:Cont�m m�todos obrigat�rios, onde classe que herdam a classe abtrata precisam seguir.
	 * em uma classe abstrata vc pode criar metodos n�o abstratos para que sejam reutilizados.
	 * Classes abstratas podem ser herdadas apenas um por classe.
	 * 
	 * Interface:Cont�m m�todos obrigat�rios, onde as classes "herdam".
	 * n�o podemos criar metodos n�o reutizaveis
	 * Interfaces podem ser herdadas multiplas vezes pelas classes
	 */

	//M�todos
	public boolean validaUsuario(String email, String senha);
	public void alterarSenha(String senha, String novaSenha);
	public void listarProdutos();
	
}
