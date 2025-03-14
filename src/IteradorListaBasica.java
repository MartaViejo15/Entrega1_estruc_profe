public class IteradorListaBasica<T> implements Iterador<T>{
    //atributo
    protected ListaBasica<T> lista;
    protected T actual;
    protected int pos;

    //constructor
    public IteradorListaBasica(ListaBasica<T> lista) {
        this.lista = lista;
        this.pos = 0;
        this.actual = lista.elemento[pos];
    }

    //metodo
    @Override
    public boolean hasNext(){
        return pos < lista.getNumElementos();
    }
    @Override
    public T next(){
        actual = lista.elemento[pos];
        pos++;
        return actual;
    }
    @Override
    public void delete(){
        lista.delete(lista.elemento[pos]);
        if(!hasNext()){
            pos--;
        }
        actual = lista.elemento[pos];
    }
}