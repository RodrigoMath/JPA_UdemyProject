package basic.model.teste;

import java.util.Arrays;

import basic.model.manytomany.Sobrinho;
import basic.model.manytomany.Tio;
import jpa.DAO;

public class SobrinhoTio {
	public static void main(String[] args) {
		// Criando os tios
		Tio t1 = new Tio();
		t1.setNome("Dante");
		Tio t2 = new Tio();
		t2.setNome("Mauro");
		Tio t3 = new Tio();
		t3.setNome("Egídio");
		Tio t4 = new Tio("Edgar");
		Tio t5 =new Tio("Carlos");
		
		//criando sobrinhos
		Sobrinho s1 = new Sobrinho();
		s1.setNome("Rodrigo");
		s1.setTio(Arrays.asList(t1,t2,t3));
		Sobrinho s2 = new Sobrinho();
		s2.setNome("Roman");
		s2.setTio(Arrays.asList(t2,t4,t5));
		Sobrinho s3= new Sobrinho();
		s3.setNome("Larissa");
		s3.setTio(Arrays.asList(t5,t3));
		
		t1.setSobrinho(Arrays.asList(s1));
		t2.setSobrinho(Arrays.asList(s1,s2));
		t3.setSobrinho(Arrays.asList(s1,s3));
		t4.setSobrinho(Arrays.asList(s2));
		t4.setSobrinho(Arrays.asList(s2));
		t5.setSobrinho(Arrays.asList(s2,s3));
		DAO<Object> dao = new DAO<>();
		dao.abrirT().incluir(t1);
		dao.incluir(t2);
		dao.incluir(t3);
		dao.incluir(t4);
		dao.incluir(t5);
		dao.incluir(s1);
		dao.incluir(s2);
		dao.incluir(s3).fecharT();
		
		
		
		
	}

}
