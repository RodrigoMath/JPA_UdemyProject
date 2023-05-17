package basic.model.teste.consulta;

import java.util.List;

import basic.model.manytomany.Ator;
import basic.model.manytomany.Filme;
import jpa.DAO;

public class ObterFilmes {

	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar(
				"obterFilmesComNotaMaiorQue", "nota", 8.5);
		
		for(Filme filme: filmes) {
			System.out.println(filme.getNome() 
					+ " => " + filme.getNota());
			
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}
}

