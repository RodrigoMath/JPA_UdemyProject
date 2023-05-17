package basic.model.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
	@ManyToOne
	private University univesities;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, University univesities) {
		super();
		this.name = name;
		this.univesities = univesities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public University getUnivesities() {
		return univesities;
	}

	public void setUnivesities(University univesities) {
		this.univesities = univesities;
	}
	

}
