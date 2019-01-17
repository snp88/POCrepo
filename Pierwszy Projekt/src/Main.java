import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownik
        var licznik = 0;
        var wyb = 0.0;

        do {


            System.out.println("-------------");
            System.out.println("licznik Petli " + licznik);
            System.out.println("Wprowadz Liczbę od 1 do 10");
            wyb = odczyt.nextLong();
            System.out.println("Wprowadzona Liczba");
            System.out.println(wyb);

            if (wyb >= 0 && wyb < 3) {
                System.out.println("słabiutko");
            }
            if (wyb >= 3 && wyb < 6) {
                System.out.println("Myslałem ze bedzie lepiej");
            }

            if (wyb >= 6 && wyb < 8) {
                System.out.println("Tak jest bejbe :D");
            }
            if (wyb >= 8 && wyb < 9) {
                System.out.println("To rozumiem :*");
            }
            if (wyb >= 9 && wyb <= 10) {
                System.out.println("Ja ciebie też");
            }
            licznik++;
            if (wyb < 1 || wyb > 10) {
                System.out.println("liczba poza zakresem");
                System.out.println("spróbuj jeszcze raz");
                licznik = 0;
            }
        }
        while (licznik < 10);


    }
}
