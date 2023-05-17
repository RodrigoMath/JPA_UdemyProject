package basic.model.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import basic.model.onetomany.Materias;
import basic.model.onetomany.Professor;
import jpa.DAO;

public class ProfessorMateriaTeste {
	public static void main(String[] args) {
		
		List<Materias> materia = new ArrayList<>();
		Professor p1 = new Professor();
		p1.setNome("Hare");
		
		
		Professor p2 = new Professor();
		p2.setNome("Bahiano");
		
		Professor p3 = new Professor();
		p3.setNome("Iara");
		
		Materias m1 = new Materias("Biologia");
		m1.setProfessores(p1);
		Materias m2 = new Materias("Matemática");
		m2.setProfessores(p2);
		Materias m3 = new Materias("Ciências");
		m3.setProfessores(p1);
		Materias m4 = new Materias("Química");
		m4.setProfessores(p3);
		
		materia.add(m1);
		materia.add(m2);
		materia.add(m3);
		materia.add(m4);
		DAO<Professor> dao1 = new DAO<>(Professor.class);
		DAO<Materias> dao = new DAO<>(Materias.class);
		dao1.abrirT().incluir(p1);
		dao1.incluir(p2);
		dao1.incluir(p3 ).fecharT();
		dao.abrirT().incluir(m1);
		dao.incluir(m2);
		dao.incluir(m3);
		dao.incluir(m4).fecharT();
		
		
		
		
		/*
		 * Professor p1 = new Professor("Hare", m1); Professor p2 = new
		 * Professor("Bahiano", m2); Professor p3 = new Professor("Iara", m4); Professor
		 * p4 = new Professor("Hare", m3); List<Professor> profMateria = new
		 * ArrayList<>(); profMateria.add(p1); profMateria.add(p2); profMateria.add(p3);
		 * profMateria.add(p4);
		 * 
		 * DAO<Professor> dao = new DAO<>(Professor.class);
		 * 
		 * if (profMateria.size() > 0) { for (Professor professor : profMateria) {
		 * dao.abrirT().incluir(professor).fecharT(); } } else {
		 * System.out.println("Não há nada a ser incluído");
		 * 
		 * }
		 */

	}

}
