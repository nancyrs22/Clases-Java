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
public class NinjaController {
	
	@Autowired
	private AppService servicio;
	
	@GetMapping("/ninjas")
	public String nuevoNinja(@ModelAttribute("ninja")Ninja ninja, Model model)
	{
		List<Dojo> lista_dojos = servicio.get_dojos();
		model.addAttribute("dojos",lista_dojos);
		return "newninja.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String create_ninja(@Valid @ModelAttribute("ninja")Ninja ninja,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			List<Dojo> lista_dojos = servicio.get_dojos();
			model.addAttribute("dojos",lista_dojos);
			return "newninja.jsp";
		}

		servicio.save_ninja(ninja);
		return "redirect:/ninjas";
	}


}
