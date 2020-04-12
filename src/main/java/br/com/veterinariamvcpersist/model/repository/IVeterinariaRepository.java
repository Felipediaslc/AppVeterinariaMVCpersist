package br.com.veterinariamvcpersist.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.veterinariamvcpersist.model.negocio.Veterinaria;

public interface IVeterinariaRepository extends CrudRepository<Veterinaria, Integer> {

}