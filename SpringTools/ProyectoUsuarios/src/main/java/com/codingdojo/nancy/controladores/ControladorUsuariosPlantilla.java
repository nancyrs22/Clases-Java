package com.codingdojo.nancy.controladores;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String registraUsuario(@RequestParam(value="nombre") String nombre, @RequestParam(value="email") String email,HttpSession session /*Se agrega para iniciar sesion*/)
	{
		System.out.println(nombre);
		System.out.println(email);
		
		session .setAttribute("nombre", nombre);/*el nombre de la variable, la variable*/
		
		return "redirect:/dashboard";
	}
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String dashboard()
	{
		return "dashboard.jsp";
	}
}
