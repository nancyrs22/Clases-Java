package com.codingdojo.nancy.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.nancy.modelos.Dojo;
import com.codingdojo.nancy.modelos.Ninja;
import com.codingdojo.nancy.repositorios.DojoRepository;
import com.codingdojo.nancy.repositorios.NinjaRepository;

@Service
public class AppService {
	
	@Autowired
	private DojoRepository repositorio_dojo;
	@Autowired
	private NinjaRepository repositorio_ninja;
	
	public Dojo save_dojo(Dojo nuevoDojo)
	{
		return repositorio_dojo.save(nuevoDojo);
	}
	
	public Ninja save_ninja(Ninja nuevoNinja) 
	{
		return repositorio_ninja.save(nuevoNinja);
	}
	
	public List<Ninja> get_ninjas()
	{
		return repositorio_ninja.findAll();
	}
	
/*	public List<Ninja> get_ninjaId(Long id)
	{
		return repositorio_ninja.findByDojo_id(id);
	}
	
	*/
	
	public List<Dojo> get_dojos()
	{
		return repositorio_dojo.findAll();
	}
	
	public Ninja find_ninja(Long id)
	{
		Optional<Ninja> optionalNinja = repositorio_ninja.findById(id);
		if(optionalNinja.isPresent())
		{
			return optionalNinja.get();
		}
		else
		{
			return null;
		}
	}
	
	public Dojo find_dojo(Long id)
	{
		Optional<Dojo> optionalDojo = repositorio_dojo.findById(id);
		if(optionalDojo.isPresent())
		{
			return optionalDojo.get();
		}
		else
		{
			return null;
		}
	}
}
