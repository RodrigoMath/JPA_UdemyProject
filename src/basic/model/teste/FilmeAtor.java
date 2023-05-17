package basic.model.teste;

import java.util.Arrays;

import basic.model.manytomany.Ator;
import basic.model.manytomany.Filme;
import jpa.DAO;

public class FilmeAtor {
	public static void main(String[] args) {
		
		Ator a1 = new Ator("Robert Deniro");
		Ator a2 = new Ator("Alpacino");
		
		
		Filme f1 = new Filme("Poderoso Chefão", 10.0);
		Filme f2 = new Filme("Scarface", 10.0);
		Filme f3 = new Filme("The irish", 10.0);
		
		f1.setAtores(Arrays.asList(a1,a2));	
		f2.setAtores(Arrays.asList(a2));
		f3.setAtores(Arrays.asList(a1));
		
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT().incluir(f1).incluir(f2).incluir(f3).incluir(a1).incluir(a2).fecharT();
		
	}

}
