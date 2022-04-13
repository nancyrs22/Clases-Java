package com.codingdojo.nancy.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.nancy.modelos.Project;
import com.codingdojo.nancy.modelos.User;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long>{
		
	List<Project> findAll();
	List<Project> findById(long id);
	
	Project save(Project nuevoProyecto);
	
	List<Project> findByUsersNotContains(User user);
	
	List<Project> findAllByUsers(User user);
}
