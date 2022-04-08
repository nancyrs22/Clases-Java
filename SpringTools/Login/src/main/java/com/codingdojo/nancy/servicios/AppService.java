package com.codingdojo.nancy.servicios;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import com.codingdojo.nancy.modelos.LoginUser;
import com.codingdojo.nancy.modelos.User;
import com.codingdojo.nancy.repositorios.UserRepository;

@Service
public class AppService {
	
	@Autowired
	private UserRepository repositorio_user;
	
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
}
