package com.codingdojo.nancy;

public class Gorila extends Mamifero{
	
	public Gorila(){
		
	}
	
	public void lanzarAlgo()
	{
		System.out.println("El gorila arrojó algo");
		nivelEnergia -= 5;
		System.out.println("Su energia ahora es de: "+nivelEnergia);
	}
	
	public void comerBananas()
	{
		System.out.println("El gorila comio una banana :D");
		nivelEnergia += 10;
		System.out.println("Su energia ahora es de: "+nivelEnergia);
	}
	
	public void escalar()
	{
		System.out.println("El gorila ha trepado un arbol :O");
		nivelEnergia -= 10;
		System.out.println("Su energia ahora es de: "+nivelEnergia);
	}
}
