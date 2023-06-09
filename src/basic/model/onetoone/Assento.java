package basic.model.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table(name = "Assento")
public class Assento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Nome_Assento")
	private String nome;
	
	
	
	public Assento() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Assento(String nome) {
		super();
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	
	
}
