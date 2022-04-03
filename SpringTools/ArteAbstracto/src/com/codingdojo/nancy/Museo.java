package com.codingdojo.nancy;

public class Museo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pintura pintura1 = new Pintura("La noche estrellada","Van gogh","es una noche con estrellas, muy borroso todo u.u","oleo");
		Pintura pintura2 = new Pintura("La Gioconda","Leonardo da Vinci","es una señora feliz :D","oleo");
		Pintura pintura3 = new Pintura("La ultima cena","Leonardo da Vinci","la ultima comida de alguien :c","oleo");
		
		Escultura escultura1 = new Escultura("El pensador","Auguste Rodin","un señor exhicionista pensando","marmol y bronce");
		Escultura escultura2 = new Escultura("David","Miguel Angel","otro señor exhicionista pero ahora parado","marmol");

		System.out.println("------- Pinturas --------");
		pintura1.verArte();
		pintura2.verArte();
		pintura3.verArte();
		System.out.println("------- Esculturas --------");
		escultura1.verArte();
		escultura2.verArte();
	}

}
