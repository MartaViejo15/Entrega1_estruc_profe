import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiccionarioBasicoTest {
    DiccionarioBasico<Integer,String> db = new DiccionarioBasico<>();

    @Test
    void add() {
        db.add(1,"a");
        db.add(2,"b");
        db.add(3,"c");
    }

    @Test
    void delete() {
        db.add(1,"a");
        db.add(2,"b");
        db.add(3,"c");
        db.add(4,"d");
        assertTrue(db.delete(2));
        db.delete(4);
        db.delete(1);
        db.delete(3);
        assertFalse(db.delete(2));
    }

    @Test
    void getIterador() {
        db.add(1,"a");
        db.add(2,"b");
        IteradorDiccionario<Integer,String> iterador = db.getIterador();
        assertTrue(iterador.hasNext());
        assertEquals(1, iterador.next());
        iterador.delete();
        assertFalse(iterador.hasNext());
    }

    @Test
    void exists() {
        db.add(1,"a");
        assertTrue(db.exists(1));
        assertFalse(db.exists(2));
    }

    @Test
    void get() {
        db.add(1,"a");
        assertEquals("a",db.get(1));
    }

    @Test
    void getNumElementos() {
        db.add(1,"a");
        db.add(2,"b");
        db.add(3,"c");
        assertEquals(3,db.getNumElementos());
    }
}