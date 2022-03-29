import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestPuzzle
{
    public static void main(String[] args) 
    {
        int numero;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i = 0; i < 10;i++)
        {
            numero = (int) (Math.random() * 50 + 1);
            //System.out.println(numero);
            numeros.add(numero);
        }
        
        for (int j = 0; j < numeros.size(); j++)
        {
            System.out.println(numeros.get(j));
        }

        // Genera 5 numeros entre 1 y 50
        // for (int i = 1; i <= 5; i++) 
        // {
        //     numero = (int) (Math.random() * 50 + 1);
        //     System.out.println(numero);
        // //     if (numeros.contains(numero)) 
        // //     {
        // //         i--;
        // //     } 
        // //     else 
        // //     {
        // //         numeros.add(numero);
        // //     }
        // // }

        // // System.out.println("La convinacion del Euromillones es:");
        // // for (int n : numeros) 
        // // {
            
        // // }
    }
}
