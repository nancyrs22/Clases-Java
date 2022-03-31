package com.codingdojo.nancy;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado cuadrado = new Cuadrado(10);
		
		Triangulo triangulo = new Triangulo(10,5);
		
		System.out.println("Area Cuadrado: "+cuadrado.area());
		System.out.println("Area Triangulo: "+triangulo.area());
		
		
	}

}
