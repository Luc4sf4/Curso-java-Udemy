package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "sobrinhos")
	private List<Tio> tios = new ArrayList<Tio>();

	public Sobrinho() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Sobrinho( String nome) {
		this.nome = nome;
	}



	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public List<Tio> getTios() {
		return tios;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTios(List<Tio> tios) {
		this.tios = tios;
	}
	
	
}
