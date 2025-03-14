public class Cola<T> {
    private ListaSE<T> Lista;
    private ElementoSE<T> primero;
    private int contador;

    public Cola() {
        ListaSE<T> lista = new ListaSE<>();
        this.primero = null;
        this.contador = 0;
    }

    public int getContador(){
        return this.contador;
    }

    public void enqueue(T elemento){
        ElementoSE<T> nuevo = new ElementoSE<>(elemento);
        if(this.primero == null){
            this.primero = nuevo;
        }else{
            ElementoSE<T> aux = this.primero;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            contador++;
        }
    }

    public T dequeue(){
        ElementoSE<T> aux = this.primero;
        this.primero = this.primero.getSiguiente();
        return aux.getDato();
    }

    public String toString(){
        String temporal = "";
        ElementoSE<T> aux = this.primero;
        while(aux != null){
            temporal += aux.getDato() + " ";
            aux = aux.getSiguiente();
        }
        return temporal;
    }
}
