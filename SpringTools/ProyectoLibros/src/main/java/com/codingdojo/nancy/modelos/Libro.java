package com.codingdojo.nancy.modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="libros")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=2, max=100, message="el titulo debe tener al menos 2 caracteres")
	private String title;
	
	@NotNull
	@Size(min=2, max=100, message="el descripcion debe tener al menos 2 caracteres")
	private String description;
	
	@NotNull
	@Size(min=2, max=100, message="el idioma debe tener al menos 2 caracteres")
	private String language;
	
	@NotNull
	@Min(1)
	private Integer pages;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date created_at;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updated_at;

	public Libro() {
		
	}

	public Libro(Long id, String title, String description, String language, Integer pages) {
		
		this.id = id;
		this.title = title;
		this.description = description;
		this.language = language;
		this.pages = pages;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
	@PrePersist
	protected void onCreated() 
	{
		this.created_at = new Date();
	}
	
	@PreUpdate
	protected void onUpdated() 
	{
		this.updated_at = new Date();
	}
	
	
	
}
