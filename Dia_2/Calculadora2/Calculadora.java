public class Calculadora {
    private double operando1;
    private double operando2;
    private String operacion; 
    private double resultado;

    public Calculadora()
    {

    }

    public void setOperandoUno(double operando1)
    {
        this.operando1 = operando1;
    }


    public void setOperandoDos(double operando2)
    {
        this.operando2 = operando2;
    }

    
    public void setOperacion(String operacion)
    {
        this.operacion = operacion;
    }



    public void realizarOperacion()
    {
        
        if(operacion=="+")
        {
            //System.out.println("Se puede sumar");
            resultado = operando1 + operando2;
        }
        else if(operacion == "-")
        {
            resultado = operando1 - operando2;
        }
    }

    public void getResultados()
    {
        System.out.println(resultado);
    }
}
