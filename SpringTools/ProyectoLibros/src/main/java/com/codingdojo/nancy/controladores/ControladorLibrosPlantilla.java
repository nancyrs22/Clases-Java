package com.codingdojo.nancy.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.nancy.modelos.Libro;
import com.codingdojo.nancy.servicios.ServicioLibros;

@Controller
public class ControladorLibrosPlantilla {
	
	private final ServicioLibros servicio;
	
	public ControladorLibrosPlantilla(ServicioLibros servicio)
	{
		this.servicio = servicio;
	}
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String dashboard(Model model)
	{
		List<Libro> libros = servicio.get_all();
		
		model.addAttribute("libros",libros);
		
		return "dashboard.jsp";
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
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String eliminarLibro(@PathVariable("id")Long id)
	{
		servicio.delete_libro(id);
		return "redirect:/dashboard";
	}
}
