package Arboles;

import java.util.HashMap;

public class Nodo {
	
	public HashMap<Character, Nodo> hijos;
	public boolean palabraCompleta;
	
	public Nodo() {
		this.hijos = new HashMap<Character, Nodo>();
		this.palabraCompleta = false;
	}
	
}