package com.codingdojo.nancy.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.nancy.modelos.Direccion;
import com.codingdojo.nancy.modelos.Usuario;
import com.codingdojo.nancy.servicios.ServicioUsuarios;

@Controller
@RequestMapping("/direcciones")
public class controladorDirecciones {
	
	private final ServicioUsuarios servicio;
	
	public controladorDirecciones(ServicioUsuarios servicio)
	{
		this.servicio=servicio;
	}
	
	@RequestMapping("/new")
	public String new_direccion(@ModelAttribute("direccion") Direccion direccion, Model model)
	{
		List<Usuario> sindireccion = servicio.get_users_no_address();
		
		model.addAttribute("usuarios_direccion",sindireccion);
		return "/direcciones/new.jsp";
	}
	
	@PostMapping("/create")
	public String create_direccion(@Valid @ModelAttribute("direccion")Direccion direccion,
									BindingResult result)
	{
		if(result.hasErrors())
		{
			return "/direcciones/new.jsp";
		}
		else
		{
			servicio.save_direccion(direccion);
			return "redirect:/dashboard";
		}
	}
}
