public class Pila<T> {
    //atributo
    private ListaSE<T> lista;

    //constructor
    public Pila() {
        this.lista = new ListaSE<>();
    }
    public Pila(ListaSE<T> lista) {
        this.lista = lista;
    }

    //metodo
    public void push(T elemento) {
        lista.add(elemento);
    }
    public T pop() {
        ElementoSE<T> temporal = lista.cabeza;
        while (temporal.getSiguiente() != null) {
            temporal = temporal.getSiguiente();
        }
        lista.delete(temporal.getDato());
        return temporal.getDato();
    }
}
