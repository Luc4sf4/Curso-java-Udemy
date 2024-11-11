package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Usuario {

	
	@Id
	private Long id;
	
	private String nome;
	
	
	@Transient 
	private String email;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
