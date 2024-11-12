package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class obterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		// jpql = Java Persistence Query Language
		String jpql = "select u from Usuario u";
		// class passa as referencias das classes
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);

		List<Usuario> usuarios = query.getResultList();

//		alternativa em uma linhas
//		List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class)
//				.setMaxResults(5)
//				.getResultList();

		for (Usuario usuario : usuarios) {
			System.out.println("Id: " + usuario.getId() + " E-mail: " + usuario.getEmail());
		}

		em.close();
		emf.close();
	}

}
