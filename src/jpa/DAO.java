package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class DAO<E> {
	

	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Class<E> classe;

	/*
	 * static { try { emf = Persistence.createEntityManagerFactory("jpaProject"); }
	 * catch (Exception e) {
	 * 
	 * } }
	 */
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		emf = Persistence.createEntityManagerFactory("jpaProject");
		em = emf.createEntityManager();
	}

	public DAO<E> abrirT() {
		em.getTransaction().begin();
		return this;
	}

	public DAO<E> fecharT() {
		em.getTransaction().commit();
		return this;
	}
	// para consultar através de uma named query
	public List<E> consultar(String nomeConsulta, Object ... params){
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		for ( int i= 0; i < params.length; i +=2) {
			query.setParameter(params[i].toString(), params[i+1]);
		}
		return query.getResultList();
	}
	public E consultarUm(String nomeConsulta, Object... params) {
		List<E> lista = consultar(nomeConsulta, params);
		return lista.isEmpty() ? null : lista.get(0);
	}
	public void fechar() {
		em.close();
	}

	public DAO<E> incluir(E entidade) {
		em.persist(entidade);
		return this;
	}
	public E obterPorID(Object id) {
		return em.find(classe, id);
	}

	public List<E> obterTodos(int qtde, int deslocamento) {
		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	

}
