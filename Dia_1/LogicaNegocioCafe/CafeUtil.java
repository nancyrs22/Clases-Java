import java.util.ArrayList;
class CafeUtil
{
    public static Integer getStreakGoal(Integer numero)
    {
        Integer suma = 0;

        for (int i = 0; i<=numero; i++)
        {
            suma += i;
        }
        return suma;
    }

    public static Double getOrderTotal(double[] prices)
    {
        Double suma = 0.0;
        for (int i = 0;i<prices.length;i++)
        {
            suma += prices[i];
            // System.out.println(suma);
        }
        return suma;
    }

    public static void displayMenu(ArrayList<String> menuItems)
    {
        for(int i = 0; i < menuItems.size(); i++)
        {
            System.out.println(menuItems.get(i));
        }
    }

    public static void addCustomer(ArrayList<String> customers)
    {
        // ArrayList<String> myArray = new ArrayList<String>();
        System.out.println("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.println("Hola " + userName);
        System.out.println("Hay " + customers.size()+" personas frente a ti.");

        customers.add(userName);

        // System.out.println(customers);
        System.out.println(customers.toString());
    }
}