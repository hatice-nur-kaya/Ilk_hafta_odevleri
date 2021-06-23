package RecursiveMetotAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
        int sayi;
        System.out.println("Sayiyi Giriniz ");
        sayi = oku.nextInt();
        int sonuc = asallik(sayi, sayi / 2);
        if (sonuc == 0)
            System.out.println(sayi+ " Asal sayi degildir\n");
        else
            System.out.println(sayi+ "  Asal sayidir\n");
        }

        

	public static int asallik(int x, int i)	{
		 if (x < 2)
		        return 0;
		    if (i == 1)
		        return 1;
		    if (x % i == 0)
		        return 0;
		    return asallik(x, i - 1);
		 
	}

}
