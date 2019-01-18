import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownik
        var licznik = 0;
        var wyb = 0.0;
        System.out.println("Jak barodz mnie kochasz");
        do {
            System.out.println("|||||||||||||||||||");
            //System.out.println("licznik Petli " + licznik);

            System.out.println("Wprowadz Liczbe od 1 do 10");
            System.out.println("|||||||||||||||||||");
            boolean sucess = true;

            do {
                try {
                    wyb = odczyt.nextLong();
                    //System.out.println("Wprowadzona Liczba");
                    //System.out.println(wyb);
                    sucess = false;
                } catch (InputMismatchException e) {
                    System.out.println("to nie jest liczba");
                    System.out.println("wpisz liczbe jeszcze raz");
                    odczyt.next( ); //zapobiega nieskonczonej petli po zlapaniu erroru
                }

            } while (sucess);//// petla wykonuje sie dopoki success == true

            licznik++;
            System.out.println("<------------->");
            if (wyb >= 0 && wyb < 3) {
                System.out.println("słabiutko");
                System.out.println("możes próbujesz jeszcze raz");
                licznik =0;
            } else if (wyb >= 3 && wyb < 6) {
                System.out.println("Myslałem ze bedzie lepiej");
                System.out.println("możes próbujesz jeszcze raz");
                licznik =0;
            } else if (wyb >= 6 && wyb < 8) {
                System.out.println("Tak jest bejbe :D");
                System.out.println("Juz prawie to mamy");
                licznik =0;
            } else if (wyb >= 8 && wyb < 9) {
                System.out.println("To rozumiem :*");
                licznik =10;
            } else if (wyb >= 9 && wyb <= 10) {
                System.out.println("Ja ciebie też");
                System.out.println("Sto razy mocniej");
                licznik =10;
            } else if (wyb < 1 || wyb > 10) {
                System.out.println("liczba poza zakresem doceniam entuzjazm :D:D");
                System.out.println("spróbuj jeszcze raz");
                licznik = 0;
            }
            System.out.println("<------------->");
        }
        while (licznik < 10);
        System.out.println("||||||||||||||||||||||||||");
        System.out.println("W końcu sie dogadalismy :D");
    }
}
