import java.util.ArrayList;

public class TestPedidos {
    public static void main(String[] args) {
    
        // Elementos del menú
        Articulo art1 = new Articulo();
        art1.nombre = "mocha";
        art1.precio = 3.50;

        Articulo art2 = new Articulo();
        art2.nombre = "cafe con leche";
        art2.precio = 5.50;

        Articulo art3 = new Articulo();
        art3.nombre = "Cafe colado";
        art3.precio = 4.00;

        Articulo art4 = new Articulo();
        art4.nombre = "capuccino";
        art4.precio = 6.00;

        //Ordenar variables -- orden1, orden2, etc.
        Pedido pedido1 = new Pedido();
        pedido1.nombre = "Cindhuri";

        Pedido pedido2 = new Pedido();
        pedido2.nombre = "Jimmy";

        Pedido pedido3 = new Pedido();
        pedido3.nombre = "Noah";

        Pedido pedido4 = new Pedido();
        pedido4.nombre = "Sam";

        // Simulaciones de aplicaciones

        pedido1.articulos.add(art3);
        pedido1.total += art3.precio;
        pedido1.listo = true;

        pedido2.articulos.add(art1);
        pedido2.total += art1.precio;
        pedido2.listo = true;

        pedido3.articulos.add(art4);
        pedido3.total += art4.precio;
        pedido3.listo = false;

        pedido4.articulos.add(art2);
        pedido4.articulos.add(art2);
        pedido4.total += art2.precio*2;
        pedido4.listo = false;


        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.listo);

        System.out.printf("Nombre: %s\n", pedido2.nombre);
        System.out.printf("Total: %s\n", pedido2.total);
        System.out.printf("Listo: %s\n", pedido2.listo);

        System.out.printf("Nombre: %s\n", pedido3.nombre);
        System.out.printf("Total: %s\n", pedido3.total);
        System.out.printf("Listo: %s\n", pedido3.listo);

        System.out.printf("Nombre: %s\n", pedido4.nombre);
        System.out.printf("Total: %s\n", pedido4.total);
        System.out.printf("Listo: %s\n", pedido4.listo);
    }
}