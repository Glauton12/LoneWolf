package principal;

import beans.ClienteBeans;
import dao.ClienteDao;

public class Principal {

	public static void main(String[] args) {
		
		ClienteBeans cb = new ClienteBeans();
		cb.setCpf("088.102.080-05");
		cb.setNome("JACK");
		cb.setNascimento("1500/04/30");
		
		ClienteDao cd = new ClienteDao();
		//cd.cadastrar(cb);
		//cd.alterar(cb);
		//cd.selecionar();
		//cd.deletar("088.102.080-05");
		
	}

}
