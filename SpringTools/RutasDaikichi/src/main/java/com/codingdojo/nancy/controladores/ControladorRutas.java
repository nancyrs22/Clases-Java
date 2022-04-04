package com.codingdojo.nancy.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ControladorRutas {


	@RequestMapping(value="/",method = RequestMethod.GET)
	public String welcome()
	{
		return "Welcome!";
	}
	
	@RequestMapping(value="/today",method = RequestMethod.GET)
	public String today()
	{
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value="/tomorrow",method = RequestMethod.GET)
	public String tomorrow()
	{
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping(value="/travel/{ciudad}", method = RequestMethod.GET)
	public String ciudad(@PathVariable("ciudad") String ciudad)
	{
		return "Felicitaciones, pronto viajaras a "+ciudad;
	}
	
	@RequestMapping(value="/lotto/{numero}",method = RequestMethod.GET)
	public String lotto(@PathVariable("numero") Integer lotto)
	{
		if(lotto % 2 == 0)
		{
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		}
		else
		{
			return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigo.";			
		}
	}
}
