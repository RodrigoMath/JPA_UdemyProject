package basic.model.teste;

import java.util.Arrays;
import java.util.List;

import basic.model.manytomany.Ator;
import basic.model.manytomany.Filme;
import jpa.DAO;

public class AtorFilme {
	public static void main(String[] args) {
		
		Ator a1 = new Ator("Robert Deniro");
		Ator a2 = new Ator("Palpatino");
		
		Filme f1 = new Filme("Poderoso Chefão",  10.0);
		Filme f2 = new Filme("The Irish", 10.0);
		
		a1.setFilmes(Arrays.asList(f1,f2));
		a2.setFilmes(Arrays.asList(f1));
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT().incluir(a1).incluir(a2).incluir(f1).incluir(f2).fecharT();
		
	}

}
