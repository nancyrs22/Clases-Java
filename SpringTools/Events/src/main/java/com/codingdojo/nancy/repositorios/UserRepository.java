package com.codingdojo.nancy.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.nancy.modelos.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

	Optional<User> findByEmail(String email);
	
}
