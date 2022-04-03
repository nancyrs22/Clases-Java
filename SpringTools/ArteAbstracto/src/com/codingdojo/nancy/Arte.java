package com.codingdojo.nancy;

public abstract class Arte {
	
	String titulo;
	String autor;
	String descripcion;
	
	public Arte(String titulo, String autor, String descripcion)
	{
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.descripcion = descripcion;
	}
	
	abstract void verArte();

}
