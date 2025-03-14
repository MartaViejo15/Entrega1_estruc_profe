import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PilaTest {

    @Test
    void push() {
        Pila<Integer> p = new Pila<>();
        p.push(1);
        p.push(2);
        p.push(3);
    }

    @Test
    void pop() {
        ListaSE<Integer> l = new ListaSE<>();
        Pila<Integer> p = new Pila<>(l);
        p.push(1);
        p.push(2);
        assertEquals(2, p.pop());
    }
}