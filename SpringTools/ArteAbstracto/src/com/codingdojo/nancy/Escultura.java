package com.codingdojo.nancy;

public class Escultura extends Arte{
	
	String material;
	
	public Escultura(String titulo,String autor, String descripcion,String material)
	{
		super(titulo,autor,descripcion);
		this.material = material;
	}
	public void verArte()
	{
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Descripcions: "+descripcion);
		System.out.println("Material: "+material);
	}
}
