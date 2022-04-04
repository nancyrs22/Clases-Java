package com.codingdojo.nancy.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.nancy.modelos.Recibo;

@Controller
public class ControladorRecibo {
	
	@RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String index(Model model) {
       
        String name = "Grace Hopper";
        String itemName = "Alambre de cobre";
        double price = 5.25;
        String description = "Tiras de metal, otra ilustración de nanosegundos.";
        String vendor = "Tienda de la esquina Pequeñas Cosas";
     
/*
        Recibo recibo1 = new Recibo("Grace Hopper",
        							"Alambre de cobre",
        							5.25,
        							"Tiras de metal, otra ilustración de nanosegundos.",
        							"Tienda de la esquina Pequeñas Cosas");
*/   
    	// ¡Tu código aquí! Agrega valores al modelo de vista que se representará
        
        model.addAttribute("nombre",name);
        model.addAttribute("item",itemName);
        model.addAttribute("precio",price);
        model.addAttribute("descripcion",description);
        model.addAttribute("vendor",vendor);
        return "index.jsp";
    }
}
