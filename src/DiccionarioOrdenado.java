public class DiccionarioOrdenado<K extends Comparable<K>,V> extends DiccionarioBasico<K,V> {
    //atributo
    protected DiccionarioBasico<K,V> Ordenado;

    //constructor
    public DiccionarioOrdenado(DiccionarioBasico<K,V> diccionario) {
        this.Ordenado = ordenar(diccionario);
    }

    //metodo
    public DiccionarioBasico<K,V> ordenar(DiccionarioBasico<K,V> diccionario) {
        if(diccionario.getNumElementos()<=1) {
            return diccionario;
        }
        DiccionarioBasico<K,V> dic = new DiccionarioBasico<>();
        while(diccionario.getNumElementos()!= 0) {
            ElementoDiccionario<K,V> mayor = diccionario.primero;
            K clave = mayor.getKey();
            V valor = mayor.getValue();
            while (mayor.getSiguiente() != null) {
                if (mayor.getKey().compareTo(mayor.getSiguiente().getKey()) == -1){ //descendentemente
                    clave = mayor.getSiguiente().getKey();
                    valor = mayor.getSiguiente().getValue();
                }
                mayor = mayor.getSiguiente();
            }
            dic.add(clave, valor);
            diccionario.delete(clave);
        }
        return dic;
    }
}
