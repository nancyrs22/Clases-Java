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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.nancy.modelos.Libro;
import com.codingdojo.nancy.modelos.LoginUser;
import com.codingdojo.nancy.modelos.User;
import com.codingdojo.nancy.servicios.AppService;

@Controller
public class UserController {
	
	@Autowired
	private AppService servicio;
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("nuevoUsuario", new User());
		model.addAttribute("nuevoLogin", new LoginUser());
		
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("nuevoUsuario") User nuevoUsuario,
							BindingResult result, Model model, HttpSession session)
	{
		servicio.register(nuevoUsuario, result);
		if(result.hasErrors())
		{
			model.addAttribute("nuevoLogin", new LoginUser());
			return "index.jsp";
		}

		session.setAttribute("user_session", nuevoUsuario);
		
		return "redirect:/dashboard";
	}
	
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("nuevoLogin") LoginUser nuevoLogin,
						BindingResult result, Model model, HttpSession session)
	{
		User user= servicio.login(nuevoLogin, result);
		if(result.hasErrors())
		{
			model.addAttribute("nuevoUsuario",new User());
			return "index.jsp";
		}
		
		session.setAttribute("user_session", user);
		
		return "redirect:/dashboard";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.removeAttribute("user_session");
		return "redirect:/";
	}
/*	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String dashboard(Model model,HttpSession session)
	{
		User currentUser = (User)session.getAttribute("user_session");
		
		if(currentUser == null)
		{
			return "redirect:/";
		}
		
		List<Libro> libros = servicio.get_all();
		model.addAttribute("libros",libros);
		
		return "dashboard.jsp";
	}
*/
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String dashboard(Model model)
	{
		List<Libro> libros = servicio.get_all();
		
		model.addAttribute("libros",libros);
		
		return "dashboard.jsp";
	}
}
