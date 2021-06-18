package Ucak_Bileti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info = new Scanner(System.in);
		int yas,yolculukTipi;
		System.out.println("Mesafe Giriniz : ");
		double km=info.nextDouble() ;
		double ucret = km * 0.10;
		System.out.println("Yaþýnýz: ");
	    yas = info.nextInt();
	    System.out.println("1-Toplama\n 2-Çýkarma\n 3-Bölme\n 4-Çarpma");
		int select =info.nextInt();
		
	    System.out.println("Yolculuk Tipini Giriniz => (1 => Tek Yön , 2 => Gidiþ Dönüþ ): ");
	    switch (select) {
	    case 1: {
	    //	 System.out.println(yolculukTipi+" Tek Yön");
	    	break;
	    }
	    case 2: {
	    	// System.out.println(yolculukTipi+ "Çift Yön ");
	    	break;
	    }
		//System.out.println("Normal Tutar : "+ucret);
		//if(yas <12 ) {
			
		//}
	 
	}
	}
}

