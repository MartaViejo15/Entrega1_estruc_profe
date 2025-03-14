import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaDoblementeEnlazadaTest {

    @Test
    void add() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        assertTrue(lista.add(1));
        assertTrue(lista.add(2));
        assertEquals(2, lista.getNumElementos());
    }

    @Test
    void delete() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        assertFalse(lista.delete(1));
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        assertTrue(lista.delete(2));
        assertTrue(lista.delete(3));
        assertTrue(lista.delete(4));
        assertTrue(lista.delete(1));
        assertFalse(lista.delete(5));

        ListaDoblementeEnlazada<Integer> lista2 = new ListaDoblementeEnlazada<>();
        lista2.add(10);
        assertTrue(lista2.delete(10));
        assertEquals(0, lista2.getNumElementos());
    }

    @Test
    void getIterador() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        IteradorListaDoblementeEnlazada<Integer> iterador = (IteradorListaDoblementeEnlazada<Integer>) lista.getIterador();
        assertTrue(iterador.hasNext());
        assertEquals(1, iterador.next());
        assertEquals(2, iterador.next());
        assertEquals(3, iterador.next());
        assertFalse(iterador.hasNext());
    }

    @Test
    void getNumElementos() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        assertEquals(0, lista.getNumElementos());
        lista.add(5);
        assertEquals(1, lista.getNumElementos());
        lista.add(10);
        assertEquals(2, lista.getNumElementos());
        lista.delete(5);
        assertEquals(1, lista.getNumElementos());
        lista.delete(10);
        assertEquals(0, lista.getNumElementos());
    }
}