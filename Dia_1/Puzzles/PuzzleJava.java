import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;

class PuzzleJava{

    public void getTenRolls()
    {
        ArrayList<Integer> arr_random = new ArrayList<Integer>();
        Random numero = new Random();
        for(int i = 0; i < 10; i++ )
        {
            int n = numero.nextInt(20);
            arr_random.add(n);
        }
        
        System.out.println("Arreglo de numeros aleatorios: "+arr_random);
        
    }

    public String getRandomLetter()
    {
        String[] arr_string = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random numero = new Random();
        int numero_letra = numero.nextInt(27);
        return arr_string[numero_letra];
        //System.out.println("La letra aleatoria es: "+ arr_string[numero_letra]);
    }

    public void generatePassword()
    {
        ArrayList<String> password = new ArrayList<String>();
        for(int i = 0; i < 8; i++)
        {
            String letra = getRandomLetter();
            password.add(letra);
        }

        System.out.println("la contraseña es: "+password);
    }

    public void getNewPasswordSet(int longitud)
    {
        
    }
    // public static void main(String[] args) {

    //     Random numero = new Random();

    //     int n = numero.nextInt(7);

    //     System.out.println(n);

    //     Random numAleatorio = new Random();
    //     int n1 = numAleatorio.nextInt(75-25+1) + 25;
    //     System.out.println(n1);
    // }
}
