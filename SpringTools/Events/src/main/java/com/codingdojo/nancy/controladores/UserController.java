package com.codingdojo.nancy.controladores;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.nancy.modelos.Event;
import com.codingdojo.nancy.modelos.LoginUser;
import com.codingdojo.nancy.modelos.State;
import com.codingdojo.nancy.modelos.User;
import com.codingdojo.nancy.servicios.AppService;

@Controller
public class UserController {
	
	@Autowired
	private AppService servicio;
	
	@GetMapping("/")
	public String index(@ModelAttribute("nuevoUsuario") User nuevoUsuario,
						@ModelAttribute("nuevoLogin") LoginUser nuevoLogin,
						Model model) {
		
		model.addAttribute("states", State.States);
		
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("nuevoUsuario") User nuevoUsuario,
						   BindingResult result, Model model, HttpSession session) {
		
		servicio.register(nuevoUsuario, result);
		if(result.hasErrors()) {
			System.out.println(result);
			model.addAttribute("nuevoLogin", new LoginUser());
			model.addAttribute("states", State.States);
			return "index.jsp";
		}
		
		session.setAttribute("user_session", nuevoUsuario);
		return "redirect:/dashboard";
		
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("nuevoLogin") LoginUser nuevoLogin,
						BindingResult result, Model model, HttpSession session) {
							
		User user = servicio.login(nuevoLogin, result);
		if(result.hasErrors()) {
			model.addAttribute("nuevoUsuario", new User());
			model.addAttribute("states", State.States);
			return "index.jsp";
		}
		
		session.setAttribute("user_session", user);
		return "redirect:/dashboard";
							
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user_session");
		return "redirect:/";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model, @ModelAttribute("event") Event event) {
		/*REVISAMOS SESION*/
		User currentUser = (User)session.getAttribute("user_session");
		if(currentUser == null) {
			return "redirect:/";
		}
		/*REVISAMOS SESION*/
		
		User myUser = servicio.find_user(currentUser.getId());
		
		model.addAttribute("states", State.States);
		model.addAttribute("user", myUser);
		/*lista de eventos en mi estado*/
		String miEstado = currentUser.getState(); //Obtenemos estado del usuario
		List<Event> eventos_miestado = servicio.eventos_estado(miEstado); //Lista de eventos
		
		List<Event> eventos_otrosedos = servicio.eventos_otros(miEstado); //Lista de eventos fuera de mi estado
		
		model.addAttribute("eventos_miestado", eventos_miestado);
		model.addAttribute("eventos_otrosedos", eventos_otrosedos);
		
		return "dashboard.jsp";
	}
	
}
