class HelloWorld {
    
    //Tipo de función: public, private
    //Tipo de valor de retorno: String, int, double. SI NO REGRESA NADA: void
    //Nombre de función
    //Parámetros que recibo -> Tipo de variable
    public static String hola() {
        return "¡Hola mundo!";
    }

    public static String hola(String nombre) {
        return "¡Hola "+nombre+"!";
    }

    public static String hola(String nombre, String apellido) {
        return "¡Hola "+nombre+" "+apellido+"!";
    }

}