package Metody;

public class metody {
    ////-----------Metoda Main
    public static void main(String[] args) {

        sayhi();
        sayhi();
        hi("karol");
        hi("jacek", "dupa");
        hi2("john", "michal", "krzysiek");

        ////------- Koniec Main
    }


    ///////-------- Prywatne metody

    private static void sayhi() {
        System.out.println("Hello Lukasz");

    }

    private static void hi(String name) {
        System.out.println("Hi, " + name);
    }

    private static void hi(String name, String name2) {
        System.out.println("Hi, " + name);
        System.out.println("HI " + name2);
    }

    //// metoda z nieokreslona liczba parametrow
    private static void hi2(String... names) {
        String result = "";
        for (String s : names) {
            result = result + s + ", ";
        }
        System.out.println("HI " + result);
    }

}
