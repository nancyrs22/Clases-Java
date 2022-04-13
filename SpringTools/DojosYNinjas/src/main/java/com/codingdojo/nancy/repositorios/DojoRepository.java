package com.codingdojo.nancy.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.nancy.modelos.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo,Long>{

	List<Dojo> findAll();
	List<Dojo> findById(long id);
	
	Dojo save(Dojo nuevoDojo);
}
