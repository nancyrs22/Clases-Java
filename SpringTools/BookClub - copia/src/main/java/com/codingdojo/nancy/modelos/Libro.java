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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotEmpty(message = "El campo de titulo no debe estar vacio")
	@Size(min=2, max=50, message="El titulo debe tener entre 2 y 50 caracteres")
	private String title;
	
	@NotEmpty(message = "El campo de autor no debe estar vacio")
	@Size(min=2, max=50, message="El titulo debe tener entre 2 y 50 caracteres")
	private String author;
	
	@NotEmpty(message = "El campo del posteador no debe estar vacio")
	@Size(min=2, max=50, message="El titulo debe tener entre 2 y 50 caracteres")
	private String postedBy;
	
	@NotEmpty(message = "El campo de pensamientos no debe estar vacio")
	@Size(min=2, max=50, message="El titulo debe tener entre 2 y 50 caracteres")
	private String thoughts;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date created_at;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updated_at;
	
	public Libro() {
		
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public String getThoughts() {
		return thoughts;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
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
