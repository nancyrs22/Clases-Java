package com.codingdojo.nancy.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.nancy.modelos.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja,Long>{

	List<Ninja> findAll();
	List<Ninja> findById(long id);
	
	Ninja save(Ninja nuevoDojo);
	
	//List<Ninja> findByDojo_id(Long id);
}
