package com.codingdojo.nancy.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ControladorOmikuji {
	@RequestMapping(value="/omikuji", method=RequestMethod.GET)
	public String omikuji()
	{
		return "index.jsp";
	}
	
	@RequestMapping(value="/omikujiFormulario",method = RequestMethod.POST)
	public String omikujiFormulario(@RequestParam(value="number")String number,
									@RequestParam(value="city")String city,
									@RequestParam(value="name")String name,
									@RequestParam(value="hobby")String hobby,
									@RequestParam(value="thing")String thing,
									@RequestParam(value="comment")String comment,
									HttpSession session,
									RedirectAttributes flash)
	{
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("comment", comment);
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping(value="/omikuji/show", method= RequestMethod.GET)
	public String omikujiShow()
	{
		return "omikujiShow.jsp";
	}
}
