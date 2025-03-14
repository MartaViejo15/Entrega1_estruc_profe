import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteradorListaSETest {

    ListaSE<Integer> lista = new ListaSE<>();
    IteradorListaSE<Integer> iterador = new IteradorListaSE<>(lista);

    @Test
    void hasNext() {
        iterador.hasNext();
        lista.add(1);
        iterador.hasNext();
        lista.add(2);
        iterador.hasNext();
        iterador.next();
        iterador.hasNext();
    }

    @Test
    void next() {
        lista.add(1);
        lista.add(2);
        lista.add(3);
        iterador.next();
    }

    @Test
    void delete() {
        lista.add(1);
        lista.add(2);
        IteradorListaSE<Integer> iterador = new IteradorListaSE<>(lista);
        iterador.delete();
        lista.add(3);
        lista.add(4);
        iterador.next();
        iterador.delete();
    }

}