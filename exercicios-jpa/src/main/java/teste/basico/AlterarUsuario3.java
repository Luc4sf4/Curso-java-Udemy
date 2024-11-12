package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		//começo da transação
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7l);
		
		//tira o usuario do estado gerenciado 
		em.detach(usuario);
		
		
		usuario.setNome("Leonardo");
		
		
		//em.merge(usuario);
		
		System.out.println("Nome: " + usuario.getNome());
		
		//Final da transação
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
