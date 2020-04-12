package br.com.veterinariamvcpersist.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.veterinariamvcpersist.model.negocio.Racao;

public interface IRacaoRepository extends CrudRepository<Racao, Integer> {

}