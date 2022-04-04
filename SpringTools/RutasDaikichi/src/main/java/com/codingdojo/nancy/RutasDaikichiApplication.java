package com.codingdojo.nancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RutasDaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RutasDaikichiApplication.class, args);
	}
	
/*	@RequestMapping("/")
	public String bienvenida()
	{
		return "Welcome";
	}
*/
}
