import static org.junit.jupiter.api.Assertions.*;

class ListaBasicaTest {
    ListaBasica<String> l = new ListaBasica<>(5);

    @org.junit.jupiter.api.Test
    void add() {
        l.add("Me");
        l.add("salio");
        l.add("fatal");
        l.add("el");
        assertTrue(l.add("examen"));
        assertFalse(l.add("algo"));
    }

    @org.junit.jupiter.api.Test
    void delete() {
        l.add("Me");
        l.add("examen");
        l.add("fatal");
        assertTrue(l.delete("examen"));
        assertFalse(l.delete("o"));
    }

    @org.junit.jupiter.api.Test
    void getIterador() {
        l.add("Me");
        l.add("salio");
        Iterador<String> it = l.getIterador();
        assertTrue(it.hasNext());
        it.next();
        it.delete();
        assertFalse(it.hasNext());
    }

    @org.junit.jupiter.api.Test
    void getNumElementos() {
        l.add("salio");
        assertEquals(1, l.getNumElementos());
    }
}