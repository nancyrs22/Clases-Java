package com.codingdojo.nancy.controladores;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControladorTemplates {
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping(value="/date",method=RequestMethod.POST)
	public String date(Model model)
	{
		Date date = new Date();
		//date.toString();
		model.addAttribute("date",date.toString());
		return "date.jsp";
	}
	
	
}
