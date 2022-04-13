package com.codingdojo.nancy.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.nancy.modelos.Libro;
import com.codingdojo.nancy.servicios.AppService;

@Controller
public class ControladorLibros {
	
	@Autowired
	private AppService servicio;
	
	public ControladorLibros(AppService servicio)
	{
		this.servicio = servicio;
	}
/*	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String dashboard(Model model)
	{
		List<Libro> libros = servicio.get_all();
		model.addAttribute("libros",libros);
		return "dashboard.jsp";
	}
*/	
	@GetMapping("/show/{id_url}")
	public String show(@PathVariable("id_url")Long id, Model model)
	{
		Libro libro_show = servicio.find_libro(id);
		model.addAttribute("libro",libro_show);
		return "show.jsp";
	}
	
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public String nuevo(@ModelAttribute("libro")Libro libro)
	{
		return "create.jsp";
	}
	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("libro")Libro libro,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "create.jsp";
		}
		else
		{
			servicio.save_libro(libro);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping(value="/edit/{id}")
	public String edit(@PathVariable("id") Long id,Model model,
						@ModelAttribute("libro")Libro libro)
	{
		Libro libro_edit = servicio.find_libro(id);
		model.addAttribute("libro",libro_edit);
		return "edit.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String update(@PathVariable("id")Long id, 
						@Valid @ModelAttribute("libro")Libro libro,
						BindingResult result)
	{
		if(result.hasErrors())
		{
			return "edit.jsp";
		}
		else
		{
			servicio.save_libro(libro);
			return "redirect:/dashboard";
		}
	}
}
