public class DiccionarioBasico<K,V> implements Diccionario<K,V> {
    //atributo
    protected ElementoDiccionario<K,V> primero;
    protected ElementoDiccionario<K,V> ultimo;
    protected int N_elementos;

    //constructor
    public DiccionarioBasico() {
        this.primero = null;
        this.ultimo = null;
        this.N_elementos = 0;
    }

    //metodo
    @Override
    public boolean add(K key, V value) {
        ElementoDiccionario<K,V> temporal = new ElementoDiccionario<>(key, value);
        if (primero == null) {
            this.primero = temporal;
            this.ultimo = temporal;
        }else{
            temporal.setAnterior(this.ultimo);
            this.ultimo.setSiguiente(temporal);
            this.ultimo = temporal;
        }
        this.N_elementos++;
        return true;
    }
    @Override
    public boolean delete(K key) {
        if (exists(key)){
            ElementoDiccionario<K,V> temporal = buscar(key);
            boolean es_primero = false;
            boolean es_ultimo = false;
            if (temporal.anterior == null){
                this.primero = temporal.getSiguiente();
                es_primero = true;
            }
            if (temporal.getSiguiente() == null){
                this.ultimo = temporal.getAnterior();
                es_ultimo = true;
            }
            if (!es_primero){
                temporal.getAnterior().setSiguiente(temporal.getSiguiente());
            }
            if (!es_ultimo){
                temporal.getSiguiente().setAnterior(temporal.getAnterior());
            }
            this.N_elementos--;
            return true;
        }
        return false;
    }
    @Override
    public IteradorDiccionario<K,V> getIterador() {
        return new IteradorDiccionario<K,V>(this);
    }
    @Override
    public boolean exists(K key) {
        return buscar(key) != null;
    }
    @Override
    public V get(K key) {
        return buscar(key).getValue();
    }
    @Override
    public int getNumElementos() {
        return this.N_elementos;
    }
    private ElementoDiccionario<K,V> buscar(K key) {
        if (primero == null || primero.getKey() == key){
            return primero;
        }
        ElementoDiccionario<K,V> aux = this.primero;
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getKey() == key) {
                return aux.getSiguiente();
            }
            aux = aux.getSiguiente();
        }
        return aux.getSiguiente();
    }
}
