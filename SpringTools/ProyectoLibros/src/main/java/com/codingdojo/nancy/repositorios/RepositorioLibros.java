package com.codingdojo.nancy.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.nancy.modelos.Libro;

public interface RepositorioLibros extends CrudRepository<Libro,Long>{

	List<Libro> findAll();
	List<Libro> findById(long id);
	
	Libro save (Libro nuevoLibro);
	
	void deleteById(Long id);
}
