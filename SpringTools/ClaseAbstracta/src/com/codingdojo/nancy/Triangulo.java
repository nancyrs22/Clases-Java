package com.codingdojo.nancy;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		//super();
		this.base = base;
		this.altura = altura;
	}
	
	public double area()
	{
		return base*altura;
	}
	
	
}
