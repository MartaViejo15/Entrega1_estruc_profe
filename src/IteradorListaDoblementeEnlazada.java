public class IteradorListaDoblementeEnlazada<T> implements Iterador<T> {
    private ElementoDoble<T> actual;
    private ListaDoblementeEnlazada<T> lista;

    public IteradorListaDoblementeEnlazada(ListaDoblementeEnlazada<T> lista) {
        this.actual = lista.cabeza;
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {
        if (!hasNext())
            return null;
        T dato = actual.getDato();
        actual = actual.getSiguiente();
        return dato;
    }

    @Override
    public void delete() {
        if (actual == null)
            return;
        ElementoDoble<T> eliminar = actual;
        actual = actual.getSiguiente();
        lista.delete(eliminar.getDato());
    }

    /*Se puede añadir operaciones hasPrevious() y previous(),
    tiene sentido si quiero recorrer la lista inversamente (es decir, desde el final),
    siendo esto una de las ventajas de las listas doblemente enlazadas.*/
    public boolean hasPrevious() {
        return actual.getAnterior() != null;
    }
    public T previous() {
        ElementoDoble<T> temporal = actual;
        actual = actual.getAnterior();
        return temporal.getDato();
    }
}
