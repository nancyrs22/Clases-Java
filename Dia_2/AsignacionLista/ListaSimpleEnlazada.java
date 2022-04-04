public class ListaSimpleEnlazada {
    public Nodo head;
    public ListaSimpleEnlazada() {
        // tu código aquí
        this.head = null;
    }
    // Los métodos de SLL van aquí. Para empezar, te mostraremos cómo agregar un nodo a la lista.
    public void add(int value) {
        Nodo newNodo = new Nodo(value);
        if(head == null) {
            head = newNodo;
        } else {
            Nodo runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNodo;
        }
    }    

    public void remove(int value)
    {

    }

    public void printValues()
    {
        Nodo runner = head;
        while(runner != null)
        {
        }
    }
}
