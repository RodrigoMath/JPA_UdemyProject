package basic.model.teste;

import java.util.Arrays;

import basic.model.onetomany.Student;
import basic.model.onetomany.University;
import jpa.DAO;

public class UniversityStudentObject {
	public static void main(String[] args) {
		// Agora sob a perspectiva de um contexto amplo (apenas teste)

				DAO<Object> daoWobject = new DAO<>();
				University u3 = new University();
				u3.setName("London U");

				Student s4 = new Student();
				s4.setName("James Silver");
				s4.setUnivesities(u3);
				u3.setStudent(Arrays.asList(s4));
				daoWobject.abrirT().incluir(u3).fecharT();
	}

}
