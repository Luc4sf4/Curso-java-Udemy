package br.com.cod3r.exercicios_sb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.cod3r.exercicios_sb.model.entities.Produto;
@Repository //Alterando para JpaRepository, pois ele mesmo possui a funcao de CrudRepository e PagingAndSorting
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
