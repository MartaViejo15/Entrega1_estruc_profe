import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteradorListaDoblementeEnlazadaTest {

    @Test
    void hasNext() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        IteradorListaDoblementeEnlazada<Integer> iterador = (IteradorListaDoblementeEnlazada<Integer>) lista.getIterador();
        assertTrue(iterador.hasNext());
        iterador.next();
        assertTrue(iterador.hasNext());
        iterador.next();
        assertTrue(iterador.hasNext());
        iterador.next();
        assertFalse(iterador.hasNext());
    }

    @Test
    void next() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        IteradorListaDoblementeEnlazada<Integer> iterador = (IteradorListaDoblementeEnlazada<Integer>) lista.getIterador();
        assertEquals(1, iterador.next());
        assertEquals(2, iterador.next());
        assertEquals(3, iterador.next());
        assertNull(iterador.next());
    }

    @Test
    void delete() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        IteradorListaDoblementeEnlazada<Integer> iterador = (IteradorListaDoblementeEnlazada<Integer>) lista.getIterador();
        iterador.next();
        iterador.delete();
        assertTrue(lista.delete(1));
        assertEquals(3, iterador.next());

        iterador.next();
        iterador.delete();
        assertFalse(lista.delete(2));
        assertEquals(null, iterador.next());

        iterador.delete();
        assertTrue(lista.delete(3));
        assertFalse(iterador.hasNext());
    }
}