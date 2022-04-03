public class Test {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("mocha", 1.55);

        articulo1.prueba();

        Pedido pedido1 = new Pedido();
        System.out.println(pedido1.getNombre());
    }
}
