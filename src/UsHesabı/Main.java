package UsHesabý;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int taban, us;
        System.out.println("Tabaný gir");
        taban = oku.nextInt();
        System.out.println("Us'su gir :");
        us = oku.nextInt();

        System.out.println("Sonuç : "+usAl(taban, us) );
    }

    public static int usAl(int taban, int us) { 

        if (taban == 1 || us == 0) { 
            return 1;
        }

        return taban * usAl(taban, us - 1);

	}
}
