public interface Diccionario<K,V> {
    boolean add(K key, V value);
    boolean delete(K key);
    IteradorDiccionario<K,V> getIterador();
    boolean exists(K key);
    V get(K key);
    int getNumElementos();
}
