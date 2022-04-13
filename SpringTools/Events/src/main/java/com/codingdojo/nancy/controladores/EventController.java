package com.codingdojo.nancy.controladores;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.nancy.modelos.Event;
import com.codingdojo.nancy.modelos.State;
import com.codingdojo.nancy.modelos.User;
import com.codingdojo.nancy.servicios.AppService;

@Controller
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	private AppService servicio;
	
	@PostMapping("/create")
	public String create_event(@Valid @ModelAttribute("event") Event event,
							   BindingResult result, Model model, HttpSession session) {
		/*REVISAMOS SESION*/
		User currentUser = (User)session.getAttribute("user_session");
		if(currentUser == null) {
			return "redirect:/";
		}
		/*REVISAMOS SESION*/
		
		if(result.hasErrors()) {
			
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
		
		servicio.save_event(event);
		return "redirect:/dashboard";
	}
}
