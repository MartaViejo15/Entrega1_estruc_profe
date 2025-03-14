import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteradorListaBasicaTest {

    @Test
    void hasNext() {
        ListaBasica<String> l = new ListaBasica<>(5);
        IteradorListaBasica<String> iterador = new IteradorListaBasica<>(l);
        l.add("fatal");
        assertTrue(iterador.hasNext());
        iterador.next();
        assertFalse(iterador.hasNext());
    }

    @Test
    void next() {
        ListaBasica<String> l = new ListaBasica<>(5);
        l.add("fatal");
        IteradorListaBasica<String> iterador = new IteradorListaBasica<>(l);
        assertEquals("fatal", iterador.next());
    }

    @Test
    void delete() {
        ListaBasica<String> l = new ListaBasica<>(5);
        l.add("fatal");
        l.add("examen");
        l.add("mal");
        IteradorListaBasica<String> iterador = new IteradorListaBasica<>(l);
        assertTrue(iterador.hasNext());
        iterador.next();
        iterador.delete();
        iterador.delete();
        assertTrue(iterador.hasNext());
    }
}