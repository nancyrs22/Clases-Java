package com.codingdojo.nancy.modelos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginUser {
	@NotEmpty(message="El campo de email es obligatorio")
	@Email(message="Ingrese un correo electronico valido")
	private String email;
	
	@NotEmpty(message="El campo de password es obligatorio")
	@Size(min=6, max=128, message="La contraseña debe tener entre 6 y 128 caracteres")
	private String password;
	
	public LoginUser() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
