package basic.model.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import basic.model.onetomany.Student;
import basic.model.onetomany.University;
import jpa.DAO;

public class UniversityStudent {
	public static void main(String[] args) {

		University u1 = new University();
		u1.setName("USP");
		Student s1 = new Student();
		s1.setName("Ledo Vaccaro");
		s1.setUnivesities(u1);
		Student s2 = new Student();
		s2.setName("Fabricio Bruno");
		s2.setUnivesities(u1);

		University u2 = new University();
		u2.setName("PUF");

		Student s3 = new Student();
		s3.setName("Golias");
		s3.setUnivesities(u2);

		u1.setStudent(Arrays.asList(s1, s2));
		u2.setStudent(Arrays.asList(s3));

		DAO<University> dao = new DAO<>();

		dao.abrirT().incluir(u1).incluir(u2).fecharT();

		

	}

}
