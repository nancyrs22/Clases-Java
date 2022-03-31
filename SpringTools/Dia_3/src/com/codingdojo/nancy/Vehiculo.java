package com.codingdojo.nancy;

public class Vehiculo {
	private int anio;
	private String marca;
	private String modelo;
	private String color;
	private int ruedas;
	protected double velocidad = 0;
	
	public Vehiculo(int anio, String marca, String modelo, String color, int ruedas) {
		super();
		this.anio = anio;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.ruedas = ruedas;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public void informacion()
	{
		System.out.println("Marca: "+this.marca+" Modelo: "+this.modelo+" Año: "+this.anio+" Color: "+this.color);
	}
	
	public String info()
	{
		return "Marca: "+this.marca+" Modelo: "+this.modelo+" Año: "+this.anio+" Color: "+this.color;
	}
}
