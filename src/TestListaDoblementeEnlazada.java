public class TestListaDoblementeEnlazada {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        ListaDoblementeEnlazada<Integer> lista2 = new ListaDoblementeEnlazada<>();
        lista.delete(2);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista2.add(5);
        lista2.add(6);
        System.out.println(lista.getNumElementos());
        lista.delete(1);
        lista.delete(5);
        lista.delete(3);
        System.out.println(lista.getNumElementos());
        lista.delete(10);

        IteradorListaDoblementeEnlazada<Integer> it = (IteradorListaDoblementeEnlazada<Integer>) lista.getIterador();
        it.hasNext();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        it.hasNext();
        it.next();

        IteradorListaDoblementeEnlazada<Integer> it2 = (IteradorListaDoblementeEnlazada<Integer>) lista2.getIterador();
        it2.next();
        it2.delete();

        IteradorListaDoblementeEnlazada<Integer> it3 = (IteradorListaDoblementeEnlazada<Integer>) lista.getIterador();
        while (it3.hasNext()) {
            it3.next();
        }
        it3.delete();

        lista.delete(1);
        lista.delete(3);
        lista.delete(4);
        lista.delete(54);
        System.out.println(lista.getNumElementos());

        lista.add(10);
        lista.add(20);
        lista.delete(20);

        ListaDoblementeEnlazada<Integer> lista3 = new ListaDoblementeEnlazada<>();
        lista3.add(100);
        lista3.delete(100);
        System.out.println(lista3.getNumElementos());

        ListaDoblementeEnlazada<Integer> lista4 = new ListaDoblementeEnlazada<>();
        lista4.add(93);
        lista4.delete(93);
        System.out.println(lista.getNumElementos());

        IteradorListaDoblementeEnlazada<Integer> it4 = (IteradorListaDoblementeEnlazada<Integer>) lista.getIterador();
        it4.hasNext();

        ListaDoblementeEnlazada<Integer> listaVacia = new ListaDoblementeEnlazada<>();
        IteradorListaDoblementeEnlazada<Integer> itVacio = new IteradorListaDoblementeEnlazada<>(listaVacia);
        itVacio.hasNext();



    }
}
