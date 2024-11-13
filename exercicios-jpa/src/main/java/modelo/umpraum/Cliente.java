package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;

	@OneToOne
	@JoinColumn(name = "assento_id", unique = true)
	private Assento assento;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, Assento assentoId) {
		this.nome = nome;
		this.assento= assentoId;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Assento getAssentoId() {
		return assento;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAssentoId(Assento assentoId) {
		this.assento = assentoId;
	}

	
}
