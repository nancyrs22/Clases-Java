package com.codingdojo.nancy.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRutas {


	@RequestMapping(value="/daikichi",method = RequestMethod.GET)
	public String welcome()
	{
		return "Welcome!";
	}
	
	@RequestMapping(value="/daikichi/today",method = RequestMethod.GET)
	public String today()
	{
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value="/daikichi/tomorrow",method = RequestMethod.GET)
	public String tomorrow()
	{
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}
