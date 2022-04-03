import java.util.ArrayList;

class Pedido
{
    private String nombre;
    private boolean listo;
    
    private ArrayList<String> articulos = new ArrayList<String>();
    private static double precio_total = 0;

    public Pedido()
    {
        String nombre = "Invitado";
        ArrayList<String> articulos = new ArrayList<String>();
    } 

    public Pedido(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Boolean getListo()
    {
        return listo;
    }
    public void setListo(boolean listo)
    {
        this.listo = listo;
    }

    public void addArticulo(Articulo articulo)
    {
        articulos.add(articulo);
    }

    public void getStatusMessage()
    {
        if(listo)
        {
            System.out.println("Tu pedido está listo.");
        }
        else
        {
            System.out.println("Gracias por esperar.Tu pedido estará listo pronto.");
        }
    }

    public void display()
    {
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println(Articulo.nombre+": "+Articulo.precio);
        System.out.println("Total: "+precio_total);
        
    }

    public double getOrderTotal()
    {
        return precio_total += Articulo.getPrecio();
    }
}