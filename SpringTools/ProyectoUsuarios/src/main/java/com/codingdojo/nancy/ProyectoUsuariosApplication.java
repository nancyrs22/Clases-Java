package com.codingdojo.nancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController //Para mostrar las URLs
public class ProyectoUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoUsuariosApplication.class, args);
	}
	
	/*@RequestMapping("/")
	public String despliegaHome()
	{
		return "Hola desde Spring";
	}
	*/
	
	
}
