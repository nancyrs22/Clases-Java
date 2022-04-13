package com.codingdojo.nancy.servicios;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.nancy.modelos.LoginUser;
import com.codingdojo.nancy.modelos.Project;
import com.codingdojo.nancy.modelos.User;
import com.codingdojo.nancy.repositorios.ProjectRepository;
import com.codingdojo.nancy.repositorios.UserRepository;

@Service
public class AppService {

	@Autowired
	private UserRepository repositorio_user;
	
	@Autowired
	private ProjectRepository repositorio_proyecto;
	
	public User register(User nuevoUsuario, BindingResult result) 
	{
		String nuevoEmail=nuevoUsuario.getEmail();
		
		//Revisamos si existe el correo electronico en la base de datos
		if(repositorio_user.findByEmail(nuevoEmail).isPresent())
		{
			result.rejectValue("email", "Unique","El nombre fue ingresado previamente."); //(input->el atributo que esta teniendo mal,palabra clave,mensaje que se desplega
		}
		if(!nuevoUsuario.getPassword().equals(nuevoUsuario.getConfirm()))
		{
			result.rejectValue("confirm", "Matches","Las contraseñas no coinciden");
		}
		if(result.hasErrors())
		{
			return null;
		}
		else
		{
			//Encriptamos contraseña
			String contra_enc = BCrypt.hashpw(nuevoUsuario.getPassword(), BCrypt.gensalt());
			nuevoUsuario.setPassword(contra_enc);
			//Guardo Usuario
			return repositorio_user.save(nuevoUsuario);
		}
	}
	
	public User login(LoginUser nuevoLogin, BindingResult result)
	{
		if(result.hasErrors())
		{
			return null;
		}
		
		//Buscamos por correo
		Optional<User> posibleUsuario = repositorio_user.findByEmail(nuevoLogin.getEmail());
		if(!posibleUsuario.isPresent())
		{
			result.rejectValue("email","Unique" ,"Correo ingresado no existe");
			return null;
		}
		
		User user_login = posibleUsuario.get();
		
		//Comparamos contraseñas encriptadas
		if(!BCrypt.checkpw(nuevoLogin.getPassword(), user_login.getPassword()))
		{
			result.rejectValue("password", "Matches", "Contraseña invalida");
		}
		if(result.hasErrors())
		{
			return null;
		}
		else
		{
			return user_login;
		}
	
	}
	
	public User save_user(User updatedUser)
	{
		return repositorio_user.save(updatedUser);
	}
	
	public User find_user(Long id)
	{
		Optional<User> optionalUser = repositorio_user.findById(id);
		if(optionalUser.isPresent())
		{
			return optionalUser.get();
		}
		else
		{
			return null;
		}
	}
	
	public Project save_project(Project nuevoProyecto)
	{
		return repositorio_proyecto.save(nuevoProyecto);
	}
	
	public Project find_project(Long id)
	{
		Optional<Project> optionalProject = repositorio_proyecto.findById(id);
		if(optionalProject.isPresent())
		{
			return optionalProject.get();
		}
		else
		{
			return null;
		}
	}
	
	public List<Project> find_my_projects(User user)
	{
		return repositorio_proyecto.findAllByUsers(user);
	}
	
	public List<Project> find_other_projects(User myUser)
	{
		return repositorio_proyecto.findByUsersNotContains(myUser);
	}
	
	public void save_project_user(Long user_id, Long project_id) {
		Project thisProject = find_project(project_id);
		User thisUser = find_user(user_id);
		
		thisUser.getProjects_joined().add(thisProject);
		repositorio_user.save(thisUser);
	}
	
	public void remove_project_user(Long user_id, Long project_id) {
		Project thisProject = find_project(project_id);
		User thisUser = find_user(user_id);
		
		thisUser.getProjects_joined().remove(thisProject);
		repositorio_user.save(thisUser);
	}
	
	public void delete_project(Long id) {
		repositorio_proyecto.deleteById(id);
	}
}

