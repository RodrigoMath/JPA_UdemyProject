package basic.model.teste;

import basic.model.onetoone.Assento;
import basic.model.onetoone.Cliente;
import jpa.DAO;

public class ClienteAssento1 {
	public static void main(String[] args) {
		Assento assento1 = new Assento("17-C");
		Cliente cliente1 = new Cliente( "Lyandra", assento1);
		
		DAO<Cliente> d1 = new DAO<>(Cliente.class);
		DAO<Assento> a1 = new DAO<>(Assento.class);
		
		a1.abrirT().incluir(assento1).fecharT();
		d1.abrirT().incluir(cliente1).fecharT();
	
	
	}

}
