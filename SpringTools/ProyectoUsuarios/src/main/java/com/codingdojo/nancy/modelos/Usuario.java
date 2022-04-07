package com.codingdojo.nancy.modelos;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class Usuario {
	
	@Id //llave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //va a aumentar de manera automatica
	private Long id;
	
	@NotNull
	@Size(min=2,max=100, message="el nombre debe tener al menos 2 caracteres")
	private String first_name;
	
	@NotNull
	@Size(min=2,max=100)
	private String last_name;
	
	@NotNull
	@Size(min=2,max=255)
	private String email;
	
	@NotNull
	@Size(min=2,max=255)
	private String password;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date created_at;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updated_at;

	@OneToOne(mappedBy="usuario",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Direccion direccion;
	public Usuario() {
		
	}

	public Usuario(String first_name, String last_name, String email, String password) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	
	@PrePersist
	protected void onCreate()
	{
		this.created_at = new Date();
	}
	
	@PreUpdate
	protected void onUpdate()
	{
		this.updated_at = new Date();
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
/*	
	private String nombre;
	private String apellido;
	private long id;
	
	public Usuario(String nombre, String apellido, long id) {
		//super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
*/	
	
}
