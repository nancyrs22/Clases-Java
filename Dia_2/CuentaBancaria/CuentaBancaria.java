class CuentaBancaria
{
    private double saldo_cc = 0;
    private double saldo_ca = 0;
    public double monto = 0;

    private static int cuentas_total = 0;
    private static double dinero_total = 0;


    public CuentaBancaria()
    {
        cuentas_total++;
    }

    public double getSaldo_cc()
    {
        return saldo_cc;
    }

    public double getSaldo_ca()
    {
        return saldo_ca;
    }

    public double depositar(double monto,String tipo_cuenta)
    {
        if(tipo_cuenta == "cc")
        {
            saldo_cc += monto;
            dinero_total += monto;
            return saldo_cc;
        }
        else
        {
            saldo_ca += monto;
            dinero_total += monto;
            return saldo_ca;
        }

    }

    public double retirar(double monto, String tipo_cuenta)
    {
        if(tipo_cuenta == "cc")
        {
            if(saldo_cc > monto)
            {
                saldo_cc -= monto;
                dinero_total -= monto;
            }
            else
            {
                System.out.println("Saldo insuficiente");
            }
            return saldo_cc;
        }
        else
        {
            if(saldo_ca > monto)
            {
                saldo_ca -= monto;
                dinero_total -= monto;
            }
            else
            {
                System.out.println("Saldo insuficiente");
            }
            return saldo_ca;
        }

    }
    public static int getCuentas_total()
    {
        return cuentas_total;
    }
    
    public static double getDinero_total()
    {
        return dinero_total;
    }
}