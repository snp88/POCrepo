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
		System.out.println("NowaPetla");
		for(int l = 0; l<10; l++) {
			for(int l1 = 10; l1<10; l1++) {
			////2	
			}
		}
	
	}
}
