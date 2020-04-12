package br.com.veterinariamvcpersist.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.veterinariamvcpersist.model.negocio.Medicina;
public interface IMedicinaRepository extends CrudRepository<Medicina, Integer> {

}