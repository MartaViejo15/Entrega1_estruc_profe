public class IteradorListaSE<T> implements Iterador<T> {
    private ListaSE<T> Lista;
    private ElementoSE<T> actual;

    public IteradorListaSE(ListaSE<T> lista) {
        this.Lista = lista;
        this.actual = lista.cabeza;
    }

    @Override
    public boolean hasNext() {
        ElementoSE<T> aux = Lista.cabeza;
        if(Lista.cabeza == null){
            return false;}
        if(aux.getSiguiente() != null){
            return true;
        }else
            return false;
    }

    @Override
    public T next() {
        T temporal = Lista.cabeza.getDato();
        actual = Lista.cabeza.getSiguiente();
        return temporal;
    }

    @Override
    public void delete(){
        ElementoSE<T> temporal = actual;
        Lista.delete(actual.getDato());
        actual = temporal.getSiguiente();
    }
}