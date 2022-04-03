public class Calculadora {
    private double operando1;
    private double operando2;
    private String operacion; 

    public Calculadora()
    {

    }

    public void setOperandoUno(double operando1)
    {
        this.operando1 = operando1;
    }
    public double getOperandoUno()
    {
        return operando1;
    }

    public void setOperacion(String operacion)
    {
        this.operacion = operacion;
    }
    public String getOperacion()
    {
        return operacion;
    }

    public void setOperandoDos(double operando2)
    {
        this.operando2 = operando2;
    }
    public double getOperandoDos()
    {
        return operando2;
    }

    public double realizarOperacion()
    {
        double resultado=0;
        if(getOperacion()=="+")
        {
            //System.out.println("Se puede sumar");
            resultado = getOperandoUno()+getOperandoDos();
        }
        else if(getOperacion()== "-")
        {
            resultado = getOperandoUno()-getOperandoDos();
        }
        return resultado;
    }

    public void getResultados()
    {
        System.out.println(realizarOperacion());
    }
}
