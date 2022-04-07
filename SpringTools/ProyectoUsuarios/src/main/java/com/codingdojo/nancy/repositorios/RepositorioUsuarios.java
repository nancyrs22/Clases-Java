package com.codingdojo.nancy.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.nancy.modelos.Usuario;

public interface RepositorioUsuarios extends CrudRepository<Usuario, Long>{
	
	List<Usuario> findAll(); //SELECT * FROM users
	List<Usuario> findByEmail(String email); //SELECT * FROM users WHERE email = '<EMAIL>'
	List<Usuario> findById(long id); //SELECT * FROM users WHERE id = <ID>
	
	//INSERT into users()
	Usuario save (Usuario nuevoUsuario);
	
	void deleteById(Long id);
	
	List<Usuario> findByEmailAndPassword(String email, String password);
	List<Usuario> findByDireccionIdIsNull();
}
