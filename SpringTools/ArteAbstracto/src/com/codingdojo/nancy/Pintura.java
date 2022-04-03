package com.codingdojo.nancy;

public class Pintura extends Arte{
	
	String tipoPintura;
	
	public Pintura(String titulo, String autor, String descripcion, String tipoPintura)
	{
		super(titulo,autor,descripcion);
		this.tipoPintura = tipoPintura;
	}
	
	public void verArte()
	{
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Descripcions: "+descripcion);
		System.out.println("Tipo de pintura: "+tipoPintura);
	}
	
}
