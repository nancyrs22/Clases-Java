import java.util.HashMap;

public class CaracterMasRepetido
{
    public static char encuentraCaracterMasRepetido(String texto)
    {
        HashMap<Character,Integer> letras = new HashMap<Character,Integer>();

        texto = texto.toLowerCase();
        for(int i = 0; i<texto.length();i++)
        {
            char letra = texto.charAt(i);
            if(letras.get(letra)==null) //si no existe esa letra
            {
                letras.put(letra,1); //
            }
            else
            {
                int conteo = letras.get(letra);
                conteo++;
                letras.put(letra,conteo);
            }
        }

        int repetidos = 0;
        char letraRepetida=' ';

        for(char letra:letras.keySet())
        {
            if(repetidos < letras.get(letra))
            {
                repetidos = letras.get(letra);
                letraRepetida = letra; 
            }
        }
        return letraRepetida;
    }

    public static void main(String args[]){
        String texto = "Hoolaaa";
        System.out.println(encuentraCaracterMasRepetido(texto));
    }
}