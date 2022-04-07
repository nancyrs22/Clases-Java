package com.codingdojo.nancy.controladores;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.nancy.modelos.Salon;
import com.codingdojo.nancy.servicios.ServicioUsuarios;

@Controller
public class ControladorSalones {
	private final ServicioUsuarios servicio;
	
	public ControladorSalones(ServicioUsuarios servicio)
	{
		this.servicio = servicio;
	}
	
	@GetMapping("/salon/{id}")
	public String show_salon(@PathVariable("id")Long id, Model model)
	{
		Salon salon_clase = servicio.find_salon(id);
		model.addAttribute("salon",salon_clase);
		return "/salones/show.jsp";
	}
	
	
	@RequestMapping("/salones")
	public String salones(Model model)
	{
		List<Salon> salones = servicio.get_Salones();
		
		model.addAttribute("salones",salones);
		
		return "/salones/index.jsp";
	}
}
