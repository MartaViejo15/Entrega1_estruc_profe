public class IteradorListaSE<T> implements Iterador<T> {
    private ListaSE<T> Lista;
    private ElementoSE<T> actual;

    public IteradorListaSE(ListaSE<T> lista) {
        this.Lista = lista;
        this.actual = lista.cabeza;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {
        T temporal = actual.getDato();
        actual = actual.getSiguiente();
        return temporal;
    }

    @Override
    public void delete(){
        ElementoSE<T> temporal = actual;
        Lista.delete(actual.getDato());
        actual = temporal.getSiguiente();
    }
}