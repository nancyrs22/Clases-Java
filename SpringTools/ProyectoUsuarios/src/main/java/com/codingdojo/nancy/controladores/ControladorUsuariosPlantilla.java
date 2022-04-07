package com.codingdojo.nancy.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.nancy.modelos.Usuario;
import com.codingdojo.nancy.servicios.ServicioUsuarios;

@Controller
public class ControladorUsuariosPlantilla {
	
	private final ServicioUsuarios servicio;
	
	public ControladorUsuariosPlantilla(ServicioUsuarios servicio)
	{
		this.servicio = servicio;
	}
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String dashboard(Model model)
	{
		List<Usuario> usuarios = servicio.get_all();
		
		model.addAttribute("usuarios",usuarios);
		
		return "dashboard.jsp";
	}
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String register(@ModelAttribute("usuario") Usuario usuario) //Model Attribute: ayuda a crear una instacia de la clase usuario
	{
		
		return "registro.jsp";
	}
	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("usuario") Usuario usuario,
						 BindingResult result)
	{
		if(result.hasErrors())
		{
			return "registro.jsp";
		}
		else
		{
			servicio.save_user(usuario);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String eliminaUsuario(@PathVariable("id") Long id)
	{
		servicio.delete_user(id);
		return "redirect:/dashboard";
	}
	
	
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login()
	{
		return "login.jsp";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="email") String email,
						@RequestParam(value="password") String password,
						HttpSession session,
						RedirectAttributes flash) {
		
		List<String> mensajes_error = new ArrayList<String>();
		boolean isValid = true;
		
		if(email.equals("")) {
			mensajes_error.add("Ingrese su correo");
			isValid = false;
		}
		
		if(password.equals("")) {
			mensajes_error.add("Ingrese su password");
			isValid = false;
		}
		
		if(isValid) {
			Usuario usuarioEncontrado = servicio.check_email_password(email, password);
			if(usuarioEncontrado == null) {
				mensajes_error.add("Credenciales incorrectas");
				flash.addFlashAttribute("error_login", mensajes_error);
				return "redirect:/login";
				
			}else {
				session.setAttribute("nombre", usuarioEncontrado.getFirst_name());
				return "redirect:/dashboard";
			}
		} else {
			flash.addFlashAttribute("error_login", mensajes_error);
			return "redirect:/login";
		}
		
	}
	
	
	@GetMapping("/show/{id_url}")
	public String show(@PathVariable("id_url")Long id, Model model)
	{
		Usuario usuario_show = servicio.find_user(id);
		model.addAttribute("usuario",usuario_show);
		return "show.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/muestraUsuario",method = RequestMethod.GET)
	public String muestraUsuario(Model model)
	{
		/*
		Usuario user1 = new Usuario("Elvis","Nieto",1);
		Usuario user2 = new Usuario("Esteban","Quito",2);
		*/
		model.addAttribute("titulo","Usuarios");
		
/*		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(user1);
		listaUsuarios.add(user2);
		
		model.addAttribute("listaUsuarios",listaUsuarios);
*/		
		return "usuarios.jsp";
	}
	
	@RequestMapping(value="/registro",method=RequestMethod.GET)
	public String registro()
	{
		return "registro.jsp";
	}
	
	@RequestMapping(value="/registroUsuario",method=RequestMethod.POST)
	public String registraUsuario(@RequestParam(value="nombre") String nombre, 
								  @RequestParam(value="email") String email,
								  HttpSession session /*Se agrega para iniciar sesion*/,
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
	

}
