import org.junit.jupiter.api.Test;

class IteradorListaSETest {

    ListaSE<Integer> lista = new ListaSE<>();

    @Test
    void hasNext() {
        lista.add(1);
        IteradorListaSE<Integer> iterador2 = new IteradorListaSE<>(lista);
        iterador2.hasNext();
        iterador2.next();
        iterador2.hasNext();
    }

    @Test
    void next() {
        lista.add(1);
        lista.add(2);
        lista.add(3);
        IteradorListaSE<Integer> iterador2 = new IteradorListaSE<>(lista);
        iterador2.next();
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