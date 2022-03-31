package com.codingdojo.nancy;

public class Auto extends Vehiculo implements manejarVehiculo{
	
	private String placas;


	public Auto(int anio, String marca, String modelo, String color, int ruedas, String placas) {
		super(anio, marca, modelo, color, ruedas);
		this.placas = placas;
	}



	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	public void informacion()
	{
		super.informacion();
		System.out.println("Placas: "+this.placas);
	}
	
	public String info()
	{
		String inf = super.info();
		return inf+" Placas: "+this.placas;
	}
	
	public void acelerar()
	{
		System.out.println("Voy a acelerar;");
		velocidad += aumento;
		System.out.println("Mi velocidad es de: "+velocidad);
	}
	
	public void desacelerar()
	{
		System.out.println("Voy a bajar mi velocidad!");
		velocidad -= aumento;
		System.out.println("Mi velocidad es de: "+velocidad);
	}
}
