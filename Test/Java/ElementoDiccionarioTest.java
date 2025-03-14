import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ElementoDiccionarioTest {
    ElementoDiccionario<Integer,String> ed = new ElementoDiccionario<>(1,"a");

    @Test
    void getKey() {
        assertEquals(1, ed.getKey());
    }

    @Test
    void getValue() {
        assertEquals("a", ed.getValue());
    }

    @Test
    void getAnterior() {
        assertNull(ed.getAnterior());
    }

    @Test
    void getSiguiente() {
        ed.setSiguiente(new ElementoDiccionario<>(2,"b"));
        assertEquals("b", ed.getSiguiente().getValue());
    }

    @Test
    void setSiguiente() {
        ElementoDiccionario<Integer,String> sig = new ElementoDiccionario<>(3,"c");
        ed.setSiguiente(sig);
    }

    @Test
    void setAnterior() {
        ElementoDiccionario<Integer,String> ant = new ElementoDiccionario<>(2,"b");
        ed.setAnterior(ant);
    }
}