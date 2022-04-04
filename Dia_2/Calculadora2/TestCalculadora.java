public class TestCalculadora {
    
	public static void main(String[] args) {
        Calculadora prueba = new Calculadora();

        prueba.setOperandoUno(13.5);
        prueba.setOperandoDos(1.5);
        prueba.setOperacion("+");

        prueba.realizarOperacion();
        prueba.getResultados();
    }

}
