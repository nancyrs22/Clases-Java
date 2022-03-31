package com.codingdojo.nancy;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = new Auto(2010,"Honda","Civic","Rojo",4,"1234ABC");
		
		//String auto1Marca = auto1.getMarca();
		//String auto1Modelo = auto1.getModelo();
		
		auto1.informacion();
		
		//Vehiculo bici = new Vehiculo(2015,"MarcaBici","Nuevo Modelo","blanca",2);
		
		//String biciMarca = bici.getMarca();
		//String biciModelo = bici.getModelo();
		
		//bici.informacion();
		
		Bicicleta bici = new Bicicleta(2015,"Apache","M55","blanca",2);
	}

}
