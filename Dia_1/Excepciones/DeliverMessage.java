public class DeliverMessage {
    public static void main(String[] args)
    {
        UnreliableFriend friend = new UnreliableFriend();
        try{
            friend.deliverMessage();
            System.out.println("El mensaje fue entregado!");
        } catch (OutOfGasException e){
            System.out.println("Hey, uh, so, me quede sin gasolina...");
            // Plan de respaldo aquí.
        }
    }
}
