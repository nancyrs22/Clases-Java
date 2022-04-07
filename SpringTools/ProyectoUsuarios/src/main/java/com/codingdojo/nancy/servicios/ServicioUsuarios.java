package com.codingdojo.nancy.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.nancy.modelos.Direccion;
import com.codingdojo.nancy.modelos.Usuario;
import com.codingdojo.nancy.repositorios.RepositorioDirecciones;
import com.codingdojo.nancy.repositorios.RepositorioUsuarios;

@Service
public class ServicioUsuarios {
	private final RepositorioUsuarios repositorio;
	private final RepositorioDirecciones repositorio_dir;
	
	public ServicioUsuarios(RepositorioUsuarios repositorio,RepositorioDirecciones repositorio_dir)
	{
		this.repositorio = repositorio;
		this.repositorio_dir = repositorio_dir;
	}
	
	public List<Usuario> get_all()
	{
		return repositorio.findAll();
	}
	
	public Usuario find_user(Long id)
	{
		Optional<Usuario> optionalUser = repositorio.findById(id);
		if(optionalUser.isPresent())
		{
			return optionalUser.get();
		}
		else
		{
			return null;
		}
	}
	
	public Usuario save_user(Usuario nuevoUsuario)
	{
		return repositorio.save(nuevoUsuario);
	}
	
	public void delete_user(Long id)
	{
		repositorio.deleteById(id);
	}
	
	public Usuario check_email_password(String email, String password)
	{
		List<Usuario> usuarioEncontrado = repositorio.findByEmailAndPassword(email,password);
		if(usuarioEncontrado.isEmpty())
		{
			return null;
		}
		else
		{
			return usuarioEncontrado.get(0);
		}
	}
	
	public List<Usuario> get_users_no_address()
	{
		return repositorio.findByDireccionIdIsNull();
	}
	
	public Direccion save_direccion(Direccion nuevaDireccion)
	{
		return repositorio_dir.save(nuevaDireccion);
	}
}
