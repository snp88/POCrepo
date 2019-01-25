package PetleWarunkowe;

public class PetleWarunkowe {
    public static void main(String[] args) {
        int[] ints = {2, 3, 5, 1, 4};
//------------- IF-------------------
        for (int i : ints) {
            if (i % 2 == 0) {
                System.out.println("podzielne przez 2 " + i);
            } else if (i % 3 == 0) {
                System.out.println("Podzielne przez 3 " + i);
            } else {
                System.out.println("niedzieli"); // domyslna instrukkcja gdy zaden warunek nie spelniony
            }

        }

        for (int i : ints) {
            if (i % 2 == 0 && i % 3 == 0) { ///&& operator and   || operaator or
                System.out.println("a");
            }
        }
//-----------Switch Case------
        int menu = 4;
        switch (menu) {
            case 1:
                System.out.println("main menu");
                break;
            case 2:
                System.out.println("game menu");
                break;
            case 3:
                System.out.println("end menu");
                break;
            default:
                System.out.println("invalid parametr");
        }
/////----------zadanie-------
        //       wszystkie cyfry podzielne prezz 3 lub przez 7
        //              po ostatniej liczbie ma nie byc przecinka
        int[] tabela;
        tabela = new int[1001];

        // zapelnienie tablicy
        for (int k=0; k < 1001; k++) {
            tabela[k]= k;
        }

        for(int i : tabela){
            if (i % 3 ==0  || i % 7 ==0){
                if(i==0){
                }
                else if (i== 999){
                    System.out.print(tabela[i]);
                }
                else{
                    System.out.print(tabela[i]+", ");

                }

            }

        }

    }
}
