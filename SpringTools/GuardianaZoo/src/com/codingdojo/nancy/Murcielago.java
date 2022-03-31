package com.codingdojo.nancy;

public class Murcielago extends Mamifero{
	
	
	
	public Murcielago()
	{
		nivelEnergia = 300;
	}
	
	public void volar()
	{
		System.out.println("Sonido de murcielago (No se como hace un murcielago pero está volando:C)");
		nivelEnergia -= 50;
		System.out.println("La energia del murcielago es: "+nivelEnergia);
	}
	
	public void comerHumano()
	{
		System.out.println("Ahhhh...!! Ayudaaaa..! - (El murcielago está comiendo)");
		nivelEnergia += 100;
		System.out.println("La energia del murcielago es: "+nivelEnergia);
	}
	
	public void atacarPueblo()
	{
		System.out.println("Ahhhh...!! Fueegooo..! Se quema el pueblo!!! - (El murcielago está atacando el pueblo)");
		nivelEnergia -= 100;
		System.out.println("La energia del murcielago es: "+nivelEnergia);
	}
	
}
