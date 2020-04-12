package br.com.veterinariamvcpersist.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.veterinariamvcpersist.model.negocio.Produto;

public interface IProdutoRepository extends CrudRepository<Produto, Integer> {

}