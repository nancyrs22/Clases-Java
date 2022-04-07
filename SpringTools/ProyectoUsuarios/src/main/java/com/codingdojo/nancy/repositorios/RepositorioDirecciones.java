package com.codingdojo.nancy.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.nancy.modelos.Direccion;
import com.codingdojo.nancy.modelos.Usuario;

@Repository
public interface RepositorioDirecciones extends CrudRepository<Direccion,Long>{
	
	List<Direccion> findAll();
	Direccion save(Direccion nuevaDireccion);
	
	
}
