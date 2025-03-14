public class ElementoDiccionario<K,V> {
    //atributo
    protected K key;
    protected V value;
    protected ElementoDiccionario<K,V> anterior;
    protected ElementoDiccionario<K,V> siguiente;

    //constructor
    protected ElementoDiccionario(K key, V value) {
        this.key = key;
        this.value = value;
        this.anterior = null;
        this.siguiente = null;
    }

    //metodo
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public ElementoDiccionario<K,V> getAnterior() {
        return anterior;
    }
    public ElementoDiccionario<K,V> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(ElementoDiccionario<K,V> siguiente) {
        this.siguiente = siguiente;
    }
    public void setAnterior(ElementoDiccionario<K,V> anterior) {
        this.anterior = anterior;
    }
}
