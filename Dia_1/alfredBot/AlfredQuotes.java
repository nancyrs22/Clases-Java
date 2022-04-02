import java.util.Date;

import javax.lang.model.util.ElementScanner6;

public class AlfredQuotes {
    Date date = new Date();
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Como estas?";
    }
    
    public String guestGreeting(String name) {

        return "Hola "+name+". Encantado de verte";
    }
    
    public String guestGreeting(String name,String dayPeriod) {

        if(dayPeriod == "noches" || dayPeriod == "tardes")
        {
            return "Buenas "+dayPeriod+" "+name+". Encantado de verte";
        }
        else
        {
            return "Buenos "+dayPeriod+" "+name+". Encantado de verte";
        }
    }

    public String dateAnnouncement() {

        return "Actualmente es: "+date.toString();
    }
    
    public String respondBeforeAlexis(String conversation) {

        int alex = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        if(alex >= 0)
        {
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso.";
        }
        else if(alfred >= 0)
        {
            return "A su servicio. Como desee, naturalmente.";
        }
        else
        {
            return "Bien. Y con eso, me retiraré.";
        }
        
    }

    public String AlfredEnojado(String grito)
    {
        return "";
    }
    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    //="comment from-rainbow">// BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!
}
