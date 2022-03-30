class Vehiculo {

    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;

    private static int cantidadVehiculos = 0; //Una variable estática y se comparte con todas las instancias de la clase. Parecido a una variable de clase en Python

    public Vehiculo() {
        cantidadVehiculos++;
    }

    public Vehiculo(String color) {
        this.color = color;
        cantidadVehiculos++;
    }

    public Vehiculo(String color, String marca, String modelo) {
        /* color ="rojo"; marca= "Honda"; modelo = "Civic" */
        this.color = color; //carro3.color = "rojo";
        this.marca = marca;
        this.modelo = modelo;
        cantidadVehiculos++;
    }

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
        cantidadVehiculos++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void arrancar() {
        System.out.println("RUUUM");
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

}