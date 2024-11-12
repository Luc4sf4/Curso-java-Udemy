package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuarios1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		//começo da transação
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7l);
		usuario.setNome("Leonardo");
		usuario.setEmail("leonardo@lanche.com.br");
		
		//comando de alteração
		em.merge(usuario);
		
		System.out.println("Nome: " + usuario.getNome()
		+"\nEmail: " + usuario.getEmail());
		
		//Final da transação
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
