public class PruebaListaBasica {
    public static void main(String[] args) {
        ListaBasica<String> l = new ListaBasica<>(5);
        l.add("Me");
        l.add("salio");
        l.add("fatal");
        l.add("el");
        l.add("examen");
        l.add("algo");
        Iterador<String> it1 = l.getIterador();
        while(it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println("la frase tiene " + l.getNumElementos() + " palabras");
        l.delete("examen");
        l.delete("o");
        Iterador<String> it2 = l.getIterador();
        it2.next();
        it2.delete();
        it2.delete();
        it2.delete();
        Iterador<String> it3 = l.getIterador();
        while(it3.hasNext()){
            System.out.print(it3.next() + " ");
        }
    }
}