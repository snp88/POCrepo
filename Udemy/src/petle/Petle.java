package petle;

import java.util.Arrays;

public class Petle {

    public static void main(String[] args) {
        /// petla for licznik , warunek wyjscia, zwiekszanie licznika
        // jezeli licznik zadeklarowany jest w deklaracji petli nie mozna go uzyc poza pętlą
        int i;
        for(i = 0; i< 1000; i++) {

            System.out.println("Nr# " + i);
        }
		/* ----petla nieskończona------
		 for (;;) {
			System.out.println("cialo petli");
		}
		*/
        System.out.println(i);
        System.out.println("NowaPetla");
        // inny zapis petli for
        int j = 20;
        for(; j>=10; j--) {
            System.out.println(j);
        }
        //////Zagnieżdzona pętla
        System.out.println("NowaPetla");
        int l3=0;
        int l4=0;
        for(int l = 0; l<10; l++) {
            System.out.print(l +" - ");
            for(int l1 = 0; l1<10; l1++) {
                ////2	nowy komentarz 323223

                System.out.print(l1 +",");
                System.out.println("NowaPetla"+ l3++);

                /// komm
            }
            System.out.println("");
        }
        /// Petla for Each wstep
        int[] ints = {4,3,65,34,23,2,15};
        for(int ii = 0; ii < ints.length; ii++) {
            System.out.println(ints[ii]);

        }
//--- FOR EACH
        for(int ii : ints) {
            System.out.println(ii);
        }
//---- Petle WHILE-------
        /* Nieskończona petla while
        while(true) {
            System.out.println(true);}
        */
        int wi=200;
        while(wi > -100){
            System.out.println(wi);
            wi--;
        }
/////----------- do WHILE-------
        ///---- Petla do while wykona sie przynajmniej raz
        do{
            System.out.println(false);
        }
        while(false);

//////-----------LABLES
        Label:
        for (int k = 0; k < 10; k++) {
            System.out.println("k= "+ k);
           // break Label;  // Natychmiast przerywa wykonywanie petli
            for (int l = 0; l < 100; l++) {
                System.out.println("l= "+ l);
              continue Label; //

            }


        }
////////----------ZADANIE
        int[] zad1 = {3,5,6,1,2,3,4};
        System.out.println(Arrays.toString(zad1));
        int suma=0;
        for (int licz: zad1)
        {
            System.out.print(licz + " ");
            suma=suma +licz;
        }
        System.out.println("");
        System.out.println(suma);
        //nowy komentarz
    }
}