class TestVehiculo {

    public static void main(String[] args) {

        // Vehiculo carro1 = new Vehiculo();
        // carro1.anio = 2001;
        // carro1.marca = "Honda";
        // carro1.modelo = "Civic";
        // carro1.color = "blanco";
        // carro1.ruedas = 4;

        // Vehiculo carro2 = new Vehiculo("rojo");
        // carro2.anio = 2020;
        // carro2.marca = "Mazda";
        // carro2.modelo = "CX-3";
        // carro2.ruedas = 4;
        // String color = "verde"; //MODIFICANDO EL COLOR
        // carro2.color = color;
        // carro2.color = "verde";



        // //Instancia tiene sus datos individuales
        // System.out.println("Marca auto1:"+carro1.marca);
        // System.out.println("Marca auto2:"+carro2.marca);

        // System.out.println("Color auto1:"+carro1.color);
        // System.out.println("Color auto2:"+carro2.color);

        Vehiculo bicicleta = new Vehiculo();
        Vehiculo auto1 = new Vehiculo();

        bicicleta.setRuedas(2);
        bicicleta.setColor("negro");

        int biciRuedas = bicicleta.getRuedas();
        String biciColor = bicicleta.getColor();

        System.out.println("Bicicleta - ruedas:"+biciRuedas+" color:"+biciColor);

        auto1.setRuedas(4);
        auto1.setColor("azul");

        int autoRuedas = auto1.getRuedas();
        String autoColor = auto1.getColor();

        System.out.println("Auto - ruedas:"+autoRuedas+" color:"+autoColor);

        Vehiculo auto2 = new Vehiculo("rojo", "Honda", "Civic");

        String auto2Color = auto2.getColor();
        String auto2Marca = auto2.getMarca();
        String auto2Modelo = auto2.getModelo();


        System.out.println("Auto2 - color:"+auto2Color+" marcar:"+auto2Marca+" modelo:"+auto2Modelo);

        auto2.setColor("naranja");

        String auto2Color2 = auto2.getColor();
        String auto2Marca2 = auto2.getMarca();
        String auto2Modelo2 = auto2.getModelo();


        System.out.println("Auto2 - color:"+auto2Color2+" marcar:"+auto2Marca2+" modelo:"+auto2Modelo2);

        //Vehiculo.cantidadVehiculos = 100;
    
        System.out.println("Cantidad Vehiculos:"+auto2.getCantidadVehiculos());

    }

}