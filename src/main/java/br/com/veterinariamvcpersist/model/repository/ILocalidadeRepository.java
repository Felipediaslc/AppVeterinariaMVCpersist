package br.com.veterinariamvcpersist.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.veterinariamvcpersist.model.negocio.Localidade;

public interface ILocalidadeRepository extends CrudRepository<Localidade, Integer> {

}