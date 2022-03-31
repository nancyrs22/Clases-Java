package com.codingdojo.nancy;

public class Bicicleta extends Vehiculo implements manejarVehiculo{
	
	public Bicicleta(int anio, String marca, String modelo, String color, int ruedas)
	{
		super(anio,marca,modelo,color,ruedas);
	}
	
	public void acelerar()
	{
		System.out.println("Voy a acelerar!");
		velocidad += .5;
		System.out.println("Mi velocidad es de: "+velocidad);
	}
	
	public void desacelerar()
	{
		System.out.println("Voy a desacelerar!");
		velocidad -= .5;
		System.out.println("Mi velocidad es de: "+velocidad);
	}
}
