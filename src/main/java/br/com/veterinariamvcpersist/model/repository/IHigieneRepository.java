package br.com.veterinariamvcpersist.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.veterinariamvcpersist.model.negocio.Higiene;

public interface IHigieneRepository extends CrudRepository<Higiene, Integer> {

}