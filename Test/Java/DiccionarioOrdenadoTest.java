import org.junit.jupiter.api.Test;

class DiccionarioOrdenadoTest {

    @Test
    void ordenar() {
        DiccionarioBasico<Integer,String> diccionario = new DiccionarioBasico<>();
        diccionario.add(1,"a");
        DiccionarioOrdenado<Integer,String> ord = new DiccionarioOrdenado<>(diccionario);
        diccionario.add(3,"b");
        diccionario.add(2,"c");
        diccionario.add(7,"d");
        diccionario.add(4,"e");
        DiccionarioOrdenado<Integer,String> ordenado = new DiccionarioOrdenado<>(diccionario);
        IteradorDiccionario<Integer,String> iterador = new IteradorDiccionario<>(ordenado.Ordenado);
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}