package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		//começo da transação
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7l);
		usuario.setNome("Leonardo");
		
		//não é necessário o merge, pois a consulta feita com um contexto 
		//transacional, o resultado da consulta
		//ele é dita como uma Entidade gerenciada
		
		//Entidade gerenciada = qualquer mudança feita sincronizada com o
		//banco de dados, mesmo sem chamar o merge
		//Resumo: qualquer mudança do objeto o jpa sincroniza com o banco de dados, atualizando os dados
		
		//em.merge(usuario);
		
		System.out.println("Nome: " + usuario.getNome());
		
		//Final da transação
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		

	}

}
