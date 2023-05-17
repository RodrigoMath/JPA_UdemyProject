package basic.model.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Professor {

	private String nome;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "professores")
	private List<Materias> materias;
	
	
	public Professor() {
		
	}
	
	
	
	
	public Professor(String nome, List<Materias> materias) {
		super();
		this.nome = nome;
		this.materias = materias;
	}




	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	


	public List<Materias> getMaterias() {
		return materias;
	}




	public void setMaterias(List<Materias> materias) {
		this.materias = materias;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
}
