public class ListaSE<T> implements Lista<T> {
    protected ElementoSE<T> cabeza;
    protected int numElementos;

    public ListaSE() {
        cabeza = null;
        numElementos = 0;
    }

    @Override
    public boolean add(T elemento) {
        ElementoSE<T> temporal = new ElementoSE<>(elemento);
        if(this.cabeza == null){
            this.cabeza = temporal;
        }else{
            ElementoSE<T> aux = this.cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(temporal);
            numElementos++;
        }
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        if(cabeza == null){
            return false;
        }else if(cabeza.getDato() == elemento){
            cabeza = cabeza.getSiguiente();
            numElementos--;
        }else{
            ElementoSE<T> aux = this.cabeza;
            while(aux.getSiguiente() != null) {
                if(aux.getSiguiente().getDato() == elemento){
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    numElementos--;
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    @Override
    public Iterador<T> getIterador(){
        return new IteradorListaSE<>(this);
    }

    @Override
    public int getNumElementos() {
        return numElementos;
    }

    public String toString(){
        String temporal = " ";
        ElementoSE<T> aux = this.cabeza;
        if(cabeza == null){
            return "Lista vacia";
        }else{
            temporal = aux.toString();
            while(aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
                temporal += ", " + aux.toString();
            }
        }
    return temporal;
    }
}
