package com.codingdojo.nancy.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.nancy.modelos.Libro;
import com.codingdojo.nancy.repositorios.RepositorioLibros;

@Service
public class ServicioLibros {
	private final RepositorioLibros repositorio;
	
	public ServicioLibros(RepositorioLibros repositorio)
	{
		this.repositorio = repositorio;
	}
	
	public List<Libro> get_all()
	{
		return repositorio.findAll();
	}
	
	public Libro find_libro(Long id)
	{
		Optional<Libro> optionalLibro = repositorio.findById(id);
		if(optionalLibro.isPresent())
		{
			return optionalLibro.get();
		}
		else
		{
			return null;
		}
	}
	
	public Libro save_libro(Libro nuevoLibro)
	{
		return repositorio.save(nuevoLibro);
	}
	
	public void delete_libro(Long id)
	{
		repositorio.deleteById(id);
	}
	
}
