package com.codingdojo.nancy.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControladorHumano {
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String hola()
	{
		return "Hola humano!";
	}
	
	@RequestMapping(value="/{nombre}/{apelldio}",method = RequestMethod.GET)
	public String holaNombre(@PathVariable("nombre")String nombre,@PathVariable("apellido")String apellido)
	{
		return "Hola "+nombre;
	}
	
	@RequestMapping(value ="/hola",method = RequestMethod.GET)
	public String holaNombreParam(@RequestParam("nombre") String nombre,@RequestParam("apellido") String apellido)
	{
		return "Hola "+nombre+" "+apellido;
	}
}
