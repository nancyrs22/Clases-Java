import java.util.ArrayList;
public class Test {

    public static void main(String[] args) {

        System.out.println("¡Hola mundo!");

        //Variables primitivas
        int ourInt; //Podemos declarar la variable SIN establecer su valor
        ourInt = 400; //Podemos asignar el valor más adelante en nuestro código
        double pi = 3.1416; //Podemos declarar y asignar un valor en la misma línea
        boolean bool = true; //true o false
        char unCaracter = 'A';

        String multiplesCaracteres = "ABCD";

        //Variables tipo objeto
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character mychar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(mychar);

        // String myString = myDouble.toString();
        // System.out.println(myString.length());
        
        //Cadenas - Strings
        String cadena = "Buenos días a todos mis Compañeros";
        int length = cadena.length();
        // System.out.println("La longitud de mi cadena es: "+ length);
        // char letra = cadena.charAt(1);
        // System.out.println(letra);

        int a = cadena.indexOf("Buenos");
        int b = cadena.indexOf("Compañeros");
        int c = cadena.indexOf("Hola");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        String str1 = "Mi nombre es ";
        String str2 = "Cynthia";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        String x = "hola";
        String y = "hola";
        System.out.println(x == y);

        //Arreglos o Arrays
        int[] myArray; //Declarando
        myArray = new int[5]; //Inicializando
        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 8;
        myArray[3] = 5;
        myArray[4] = 9;

        int[] myArray2 = {4, 8, 8, 5, 9};

        ArrayList<Integer> myArray3 = new ArrayList<Integer>();
        myArray3.add(10);

        //Condicionales y Operadores
        boolean llueve = false;
        boolean soleado = true;

        if(ourInt == myInt) {
            System.out.println("Números iguales");
        } else {
            System.out.println("Números distintos");
        }  

        if(llueve) {
            System.out.println("Lleva paraguas");
        } else if(soleado) {
            System.out.println("Ponte bloqueador");
        } else {
            System.out.println("Disfruta tu día!");
        }

        llueve = true;
        if(llueve && soleado) { //|| OR
            System.out.println("Busca un arcoiris");
        }

        //Bucles
        int i = 0;
        while(i<7) {
            System.out.println(i);
            i++;
        }

        for (int j=0; j<7; j++){
            System.out.println("foo");
        }

        HelloWorld helloApp = new HelloWorld();
        System.out.println(helloApp.hola());
        System.out.println(helloApp.hola("Valeria"));
        System.out.println(helloApp.hola("Valeria", "Romero"));
    


        

    }


}