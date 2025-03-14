public class IteradorDiccionario<K,V> implements Iterador<K> {
    //atributo
    protected DiccionarioBasico<K,V> diccionario;
    protected ElementoDiccionario<K,V> actual;

    //constructor
    public IteradorDiccionario(DiccionarioBasico<K,V> diccionario) {
        this.diccionario = diccionario;
        this.actual = diccionario.primero;
    }

    //metodo
    @Override
    public boolean hasNext() {
        return actual.getSiguiente() != null;
    }
    @Override
    public K next() {
        K temporal = actual.getKey();
        actual = actual.getSiguiente();
        return temporal;
    }
    @Override
    public void delete() {
        ElementoDiccionario<K,V> temporal = actual.getSiguiente();
        diccionario.delete(actual.getKey());
        actual = temporal;
    }
}
