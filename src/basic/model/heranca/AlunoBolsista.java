package basic.model.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {
	
	private double valorBolsa;
	
	public AlunoBolsista() {
		// TODO Auto-generated constructor stub
	}

	public AlunoBolsista(Long matricula,String nome ,double valorBolsa) {
		super(matricula, nome);
		this.valorBolsa = valorBolsa;
	}
	
	

}
