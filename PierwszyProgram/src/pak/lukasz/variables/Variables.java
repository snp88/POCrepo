package pak.lukasz.variables;

public class Variables {
	public static void main(String[] args) {
	
		int x = 42 + 23;
		byte b = 127 ;
		short s = Short.MAX_VALUE;
		System.out.println(x+b+s);
		
		long l =Long.MAX_VALUE;
		System.out.println(l);
		float f = 0.0f;
		System.out.println(f);
	String str = "dupa";
	System.out.println(str);
	//-----------------------------------///
	//-----------------------------------///
	int x1 = 3;
	
	System.out.println(x + b);
	System.out.println(x1++);
	System.out.println(++x1);
	
	//------cons--------//
	//def final
	
	final int STALA_1 = 10;
	int z1; 
	z1 = 8;
	// nie mozna zmienic wartosci stala = 1; 
	System.out.println(z1);
	System.out.println(STALA_1);
	
	var zmienna = 5;
	// var zawsze musi miec deklaracje //var zm1;
	// nie moze byc nullem //var nu = null; 
	var z2 = 1.1; // zmienna typu double
	var z3 = "napis"; // zmienna typu string
	var z4 = 'w'; // zmienna typu char 
	
	
	
	
	
	
	
	
	 }
}