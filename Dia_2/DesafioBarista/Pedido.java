import java.util.ArrayList;

class Pedido
{
    private String nombre;
    // private double total;
    private boolean listo;
    
    private ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    public Pedido()
    {
        this.nombre = "Invitado";
        articulos = new ArrayList[];
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

    // public double getTotal()
    // {
    //     return total;
    // }
    // public void setTotal(double total)
    // {
    //     this.total = total;
    // }

    public boolean getListo()
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
            System.out.println("Tu pedido esta listo");
        }
        else
        {
            System.out.println("Gracias por esperar. Tu pedido estará listo pronto");
        }
    }

    public void display()
    {
        System.out.println("Nombre Cliente: " + pedido.nombre);
        System.out.println(articulo.nombre+" : "+articulo.precio);
        System.out.println("Nombre Cliente: " + articulo.nombre);
    }   
}