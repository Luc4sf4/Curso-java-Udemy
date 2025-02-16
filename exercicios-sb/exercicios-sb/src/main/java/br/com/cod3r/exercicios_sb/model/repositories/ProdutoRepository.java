package br.com.cod3r.exercicios_sb.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cod3r.exercicios_sb.model.entities.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
