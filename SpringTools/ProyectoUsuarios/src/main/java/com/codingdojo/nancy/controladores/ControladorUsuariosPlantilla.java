package com.codingdojo.nancy.controladores;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.nancy.modelos.Usuario;

@Controller
public class ControladorUsuariosPlantilla {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping(value = "/muestraUsuario",method = RequestMethod.GET)
	public String muestraUsuario(Model model)
	{
		Usuario user1 = new Usuario("Elvis","Nieto",1);
		Usuario user2 = new Usuario("Esteban","Quito",2);
		
		model.addAttribute("titulo","Usuarios");
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(user1);
		listaUsuarios.add(user2);
		
		model.addAttribute("listaUsuarios",listaUsuarios);
		
		return "usuarios.jsp";
	}
	
	@RequestMapping(value="/registro",method=RequestMethod.GET)
	public String registro()
	{
		return "registro.jsp";
	}
	
	@RequestMapping(value="/registroUsuario",method=RequestMethod.POST)
	public String registraUsuario(@RequestParam(value="nombre") String nombre, @RequestParam(value="email") String email,HttpSession session /*Se agrega para iniciar sesion*/,
									RedirectAttributes flash/*se agregan mensaje flash para validar*/)
	{
		System.out.println(nombre);
		System.out.println(email);
		
		ArrayList<String> mensajes = new ArrayList<String>();
		
		boolean isValid = true;
		
		if(nombre.equals(""))
		{
			mensajes.add("Por favor proporciona tu nombre.");
			isValid = false;
			//return "redirect:/registro";
		}
		
		if(email.equals(""))
		{
			mensajes.add("Por favor proporciona tu email.");
			isValid = false;
			//return "redirect:/registro";
		}
		
		if(!isValid)
		{
			flash.addFlashAttribute("error_registro",mensajes);
			return "redirect:/registro";
		}
		
		session .setAttribute("nombre_session", nombre);/*el nombre de la variable, la variable*/
		
		return "redirect:/dashboard";
	}
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String dashboard()
	{
		return "dashboard.jsp";
	}
}
