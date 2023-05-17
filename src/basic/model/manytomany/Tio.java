package basic.model.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Sobrinho> sobrinho;
	
	public Tio() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Tio(String nome) {
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


	public List<Sobrinho> getSobrinho() {
		return sobrinho;
	}


	public void setSobrinho(List<Sobrinho> sobrinho) {
		this.sobrinho = sobrinho;
	}

	

}
