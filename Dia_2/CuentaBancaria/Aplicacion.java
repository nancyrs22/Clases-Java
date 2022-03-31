class Aplicacion {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.depositar(100,"cc");
        cuenta1.retirar(40,"cc");

        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.depositar(250.60,"ca");
        cuenta2.retirar(99.90, "ca");

        System.out.println("El saldo de tu cuenta es: "+cuenta1.getSaldo_cc());

        System.out.println("Cantidad de cuentas: "+cuenta1.getCuentas_total());
        System.out.println("Cantidad total de dinero: "+cuenta1.getDinero_total());

        System.out.println("El saldo de tu cuenta es: "+cuenta2.getSaldo_cc());

        System.out.println("Cantidad de cuentas: "+cuenta2.getCuentas_total());
    }
}

