package basic.model.teste;

import java.util.ArrayList;
import java.util.List;

import basic.model.manytomany.Tio;
import jpa.DAO;

public class Pesquisa {
	public static void main(String[] args) {
		
		DAO<Tio> dao = new DAO<>(Tio.class);
		List<Tio> tios = dao.obterTodos(5, 0);
		
		for (Tio tio : tios) {
			System.out.println("ID: " + tio.getId() + " de nome : " + tio.getNome());
			
		}
		
	
	}

}
