package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atores")
public class Ator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;

	@ManyToMany(mappedBy = "atores", cascade = CascadeType.PERSIST)
	private List<Filme> filmes = new ArrayList<>();

	public Ator() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Ator(String nome) {
		this.nome = nome;
	}



	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	

}
