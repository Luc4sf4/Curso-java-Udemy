package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;

	private Double nota;

	@ManyToMany(cascade =CascadeType.PERSIST )
	@JoinTable(name = "atores_filmes",
			// join column para a tabela que estamos -> filmes
			joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
			// a partir da outra entidade
			inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id"))
	private List<Ator> atores = new ArrayList<>();

	public Filme() {

	}

	public Filme(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getNota() {
		return nota;
	}

	public List<Ator> getAtores() {
		if(atores == null) {
			atores = new ArrayList<>();
		}
		return atores;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}

	public void adicionarAtor(Ator ator) {

		if (ator != null && !getAtores().contains(ator)) {
			getAtores().add(ator);
			
			if (!ator.getFilmes().contains(this)) {
				ator.getFilmes().add(this);
			}
		}
	}

}
