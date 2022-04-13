package com.codingdojo.nancy.modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ninjas")
public class Ninja {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="El campo de nombre es obligatorio")
	@Size(min=2, max=30, message="El Nombre debe tener entre 2 y 30 caracteres")
	private String first_name;
	
	@NotEmpty(message="El campo de apellido es obligatorio")
	@Size(min=2, max=30, message="El apellido debe tener entre 2 y 30 caracteres")
	private String last_name;
	
	@Min(10)
	@Max(100)
	private int age;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dojo_id")
	private Dojo escuela;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date created_at;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updated_at;

	public Ninja() {
		
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
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dojo getEscuela() {
		return escuela;
	}

	public void setEscuela(Dojo escuela) {
		this.escuela = escuela;
	}

	@PrePersist
	protected void onCreate() {
		this.created_at = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updated_at = new Date();
	}

	
}
