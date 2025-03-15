public class Ex6 {
    public static void main(String[] args) {
        //        6.    Aveti o variabila de tip referential String in care
//        este stocata o propozitie din 7-8 cuvinte (scrise la alegere).
//            Trebuie cu ajutorul lui indexOf si lastIndexOf sa afisati prima
//        aparitie a literei m (daca este) si ultima aparitie.

        String propozitie = "Maine mergem la picnic cu familia Ionescu.";

        System.out.println("Prima aparitie a literei m - " + propozitie.indexOf('m'));  // prima aparitie m - 6
        System.out.println("Ultima aparitie a literei m - " + propozitie.lastIndexOf( 'm')); // ultima aparitie m - 28


    }
}

