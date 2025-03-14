import org.junit.jupiter.api.Test;

class ElementoSETest {

    ElementoSE<Integer> e = new ElementoSE<>(6);
    ListaSE<Integer> lista = new ListaSE<>();

    @Test
    void getDato() {
        e.getDato();
    }

    @Test
    void setDato() {
        e.setDato(7);
    }

    @Test
    void getSiguiente() {
        lista.add(1);
        lista.add(2);
        e.getSiguiente();
    }

    @Test
    void setSiguiente() {
        lista.add(1);
        ElementoSE<Integer> elem1= new ElementoSE<>(6);
        e.setSiguiente(elem1);
    }

    @Test
    void testToString() {
        System.out.println(e.toString());
    }
}