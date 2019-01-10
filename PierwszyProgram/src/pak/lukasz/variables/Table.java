package pak.lukasz.variables;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///////// tablice jednowymiarowe
		int[] ints;
		ints = new int  [3]; // deklaracja wielkosci tablica ma 3 elemtny
		ints [0] = 6; // pierwszy element ma index 0
		ints [1] = 3;
		ints [2] = 765; 
		System.out.println(ints[1]);
		System.out.println(ints[0]); 
		System.out.println(ints[2]);
		System.out.println(ints[1]);
		
		String[] tablicastringow = {"element", "element2", "element3 "};  
		System.out.println(tablicastringow[0] +" "+ tablicastringow[1]);
	/////// tablice wielowymiarowe
		String[][]tab2 = {
				{"q", "w", "e"},
				{"a"},
				{"element","element1", "element2"}
				};
		System.out.println(tab2[0][2]);
		System.out.println(tab2[1][0]);
		System.out.println(tab2[2][2]);
		
		int[][][] tab3 = new int [][][] {{{1, 2}, {3, 4}}, {{5, 6},{7, 8}}};
		System.out.println( );
		
		int [] tab4 = {2, 4, 6};//deklaracja odrazu z wartosciami tabilcy
		System.out.println(tab4[0]);
		tab4[0]= tab4[0] + 8; // dodawanie do elementu 1
		tab4[1] = tab4[1] * 2; // mno¿enie elementu 2
		System.out.println(tab4[0]);
		System.out.println(tab4[1]);
		System.out.println(tab4[0]+ tab4[1]); // dzialanie odrazu w funkcji print
		
		
		
		
		
		
	}

}
