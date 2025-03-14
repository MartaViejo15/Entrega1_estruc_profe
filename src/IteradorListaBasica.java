public class IteradorListaBasica<T> implements Iterador<T>{
    //atributo
    protected ListaBasica<T> lista;
    protected int pos;

    //constructor
    public IteradorListaBasica(ListaBasica<T> lista) {
        this.lista = lista;
        this.pos = 0;
    }

    //metodo
    @Override
    public boolean hasNext(){
        return pos < lista.getNumElementos();
    }
    @Override
    public T next(){
        T temporal = lista.elemento[pos];
        pos++;
        return temporal;
    }
    @Override
    public void delete(){
        lista.delete(lista.elemento[pos]);
        if(!hasNext()){
            pos--;
        }
    }
}