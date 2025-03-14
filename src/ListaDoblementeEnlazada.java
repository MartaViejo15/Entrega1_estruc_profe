public class ListaDoblementeEnlazada<T> implements Lista<T> {
    protected ElementoDoble<T> cabeza;
    private ElementoDoble<T> cola;
    private int numElementos;

    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
        numElementos = 0;
    }

    @Override
    public boolean add(T elemento) {
        ElementoDoble<T> nuevo = new ElementoDoble<>(elemento);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        numElementos++;
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        if (cabeza == null) {
            return false;
        }
        ElementoDoble<T> actual = cabeza;
        while (actual != null) {
            if (actual.getDato().equals(elemento)) {
                if (actual == cabeza){
                    cabeza = cabeza.getSiguiente();
                    if (cabeza != null)
                        cabeza.setAnterior(null);
                } else if (actual == cola) {
                    cola = cola.getAnterior();
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                numElementos--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        return new IteradorListaDoblementeEnlazada<>(this);
    }

    @Override
    public int getNumElementos() {
        return numElementos;
    }
}


