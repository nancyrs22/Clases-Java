package Arboles;

public class Arbol {
	
	public Nodo raiz;
	
	public Arbol() {
		this.raiz = new Nodo();
	}
	/* raiz = NODO RAIZ ->Hijos {}; palabraCompleta = false
	 * palabra = "MIO"
	 * 
	 * 
	 * nodoActual = NODO RAIZ
	 * i=0
	 * letra = M
	 * hijo = NULL
	 * hijo = NODO M ->Hijos {}; palabraCompleta = false
	 * NODO RAIZ ->Hijos {"M": NODO M}
	 * 
	 * nodoActual = NODO M ->Hijos {}; palabraCompleta = false 
	 * i=1
	 * letra = I
	 * hijo = NULL
	 * hijo = NODO I ->Hijos {}; palabraCompleta = false
	 * NODO M ->Hijos {"I": NODO I}
	 * 
	 * nodoActual = NODO I ->Hijos {}; palabraCompleta = false
	 * i=2
	 * letra = O
	 * hijo = NULL
	 * hijo = NODO O ->Hijos {}; palabraCompleta = false
	 * NODO I ->Hijos {"O": NODO O}
	 * 
	 * nodoActual = NODO O
	 * NODO O palabraCompleta = true
	 * 
	 * 
	 * 
	 * palabra = "MIA"
	 * nodoActual = NODO RAIZ ->Hijos {"M": NODO M}
	 * 
	 * i=0
	 * letra = M
	 * hijo = NODO M
	 * nodoActual = NODO M ->Hijos {"I": NODO I}
	 * 
	 * i=1
	 * letra = I
	 * hijo = NODO I
	 * nodoActual = NODO I ->Hijos {"O": NODO O}
	 * 
	 * i=2
	 * letra = A
	 * hijo = NULL
	 * hijo = NODO A ->Hijos {}; palabraCompleta = false
	 * NODO I ->Hijos {"O": NODO O; "A": NODO A}
	 * nodoActual = NODO A
	 * 
	 * NODO A -> palabraCompleta = true
	 * 
	 * */
	
	
	public void insertarPalabra(String palabra) {
		
		Nodo nodoActual = this.raiz;
		
		for(int i=0; i<palabra.length(); i++) {
			
			Character letra = palabra.charAt(i);
			
			Nodo hijo = nodoActual.hijos.get(letra);
			
			if(hijo == null) {
				hijo = new Nodo();
				nodoActual.hijos.put(letra, hijo);
			}
			
			nodoActual = hijo;
			
		}
		
		nodoActual.palabraCompleta = true;
		
	}
	
}