package com.codingdojo.nancy.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.nancy.modelos.Dojo;
import com.codingdojo.nancy.modelos.Ninja;
import com.codingdojo.nancy.servicios.AppService;

@Controller
public class DojoController {

	@Autowired
	private AppService servicio;

	@GetMapping(value="/dojos")
	public String nuevoDojo(@ModelAttribute("dojo")Dojo dojo)
	{
		return "newdojo.jsp";
	}
	
	@PostMapping("/dojos/create")
	public String create_dojo(@Valid @ModelAttribute("dojo") Dojo dojo,BindingResult result) 
	{
		if(result.hasErrors())
		{
			
			return "newdojo.jsp";
		}
		servicio.save_dojo(dojo);
		return "redirect:/dojos";
	}
	
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id")Long id, Model model)
	{
		Dojo dojo_show = servicio.find_dojo(id);
		model.addAttribute("dojo",dojo_show);
		
		List<Ninja> ninjas = servicio.get_ninjas();
		System.out.print(ninjas);
		model.addAttribute("ninjas",ninjas);
		return "index.jsp";
	}
	

}
