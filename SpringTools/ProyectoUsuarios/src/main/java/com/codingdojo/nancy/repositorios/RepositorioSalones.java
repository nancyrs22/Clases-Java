package com.codingdojo.nancy.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.nancy.modelos.Salon;

@Repository
public interface RepositorioSalones extends CrudRepository<Salon,Long>{
	
	List<Salon> findAll();
	List<Salon> findById(long id);
}
