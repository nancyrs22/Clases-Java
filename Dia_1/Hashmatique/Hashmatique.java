
import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Cancion Uno", "Devon ha contratado a tu compañía para organizar su lista de canciones.");
        trackList.put("Cancion Dos", "Parte de esto es que ellos no quieren utilizar números de canciones para almacenar las letras hasta que estén seguros del orden.");
        trackList.put("Cancion Tres", "Insisten en que puedan recuperar inmediatamente las letras basados en el nombre de la canción");
        trackList.put("Cancion Cuatro", "También quieren poder ver las letras que les siguen inmediatamente.");

        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
        System.out.println("Extraer una cancion por su titulo: "+trackList.get("Cancion Dos"));
    }
}
