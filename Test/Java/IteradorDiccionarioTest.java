import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteradorDiccionarioTest {

    @Test
    void hasNext() {
        DiccionarioBasico<Integer,String> diccionario = new DiccionarioBasico<>();
        diccionario.add(1,"a");
        IteradorDiccionario<Integer,String> iteradorDiccionario = new IteradorDiccionario<>(diccionario);
        assertFalse(iteradorDiccionario.hasNext());
        diccionario.add(2,"b");
        assertTrue(iteradorDiccionario.hasNext());
    }

    @Test
    void next() {
        DiccionarioBasico<Integer,String> diccionario = new DiccionarioBasico<>();
        diccionario.add(1,"a");
        IteradorDiccionario<Integer,String> iteradorDiccionario = new IteradorDiccionario<>(diccionario);
        diccionario.add(2,"b");
        assertEquals(1,iteradorDiccionario.next());
    }

    @Test
    void delete() {
        DiccionarioBasico<Integer,String> diccionario = new DiccionarioBasico<>();
        diccionario.add(1,"a");
        IteradorDiccionario<Integer,String> iteradorDiccionario = new IteradorDiccionario<>(diccionario);
        diccionario.add(2,"b");
        iteradorDiccionario.delete();
        //assertFalse(iteradorDiccionario.hasNext());
    }
}