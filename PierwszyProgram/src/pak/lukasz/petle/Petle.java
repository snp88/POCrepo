package pak.lukasz.petle;


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
		System.out.println("Petla zagniezdzona");
		//////Zagnieżdzona pętla
		for(int l = 0; l<10; l++) {
			System.out.print(l +" - ");
			for(int l1 = 0; l1<10; l1++) {
			////2	nowy komentarz 323223
				System.out.print(l1 +",");
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
	}
}
