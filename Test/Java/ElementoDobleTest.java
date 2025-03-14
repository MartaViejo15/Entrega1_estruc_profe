import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElementoDobleTest {
    ElementoDoble<Integer> el = new ElementoDoble<>(1);

    @Test
    void getDato() {
        assertEquals(1,el.getDato());
    }

    @Test
    void setAnterior() {
        ElementoDoble<Integer> ant = new ElementoDoble<>(0);
        el.setAnterior(ant);
        assertEquals(0,el.getAnterior().getDato());
    }

    @Test
    void getAnterior() {
        ElementoDoble<Integer> ant = new ElementoDoble<>(0);
        el.setAnterior(ant);
        assertEquals(0,el.getAnterior().getDato());
    }

    @Test
    void setSiguiente() {
        ElementoDoble<Integer> sig = new ElementoDoble<>(2);
        el.setSiguiente(sig);
        assertEquals(2,el.getSiguiente().getDato());
    }

    @Test
    void getSiguiente() {
        ElementoDoble<Integer> sig = new ElementoDoble<>(2);
        el.setSiguiente(sig);
        assertEquals(2,el.getSiguiente().getDato());
    }
}