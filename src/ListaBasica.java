public class ListaBasica<T> implements Lista<T> {
    //atributos
    protected T[] elemento;
    protected int tamaño;
    protected int max;

    //constructor
    public ListaBasica(int max) {
        this.max = max;
        this.tamaño = 0;
        this.elemento = (T[]) new Object[max];
    }

    //metodos
    @Override
    public boolean add(T elemento) {
        if (tamaño < max) {
            this.elemento[tamaño] = elemento;
            this.tamaño++;
            return true;
        } else
            return false;
    }

    @Override
    public boolean delete(T elemento) {
        for(int i = 0; i < tamaño; i++){
            if (elemento == this.elemento[i]){
                int pos = i;
                for(;pos+1<tamaño;pos++){
                    this.elemento[pos] = this.elemento[pos+1];
                }
                this.elemento[pos] = null;
                this.tamaño--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        return new IteradorListaBasica<>(this);
    }
    @Override
    public int getNumElementos() {
        return tamaño;
    }
}
