package Hesap_Makinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		double x ,y;
		int select;
		System.out.println("Birinci Sayýyý Giriniz : ");
		x=info.nextDouble();
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		y=info.nextDouble();
		System.out.println("Ýkinci Sayýyý Giriniz : ");

		System.out.println("1-Toplama\n 2-Çýkarma\n 3-Bölme\n 4-Çarpma");
		select =info.nextInt();
		System.out.print("Seçiminiz : ");
		switch (select) {
		case 1: {
			 System.out.println("Toplama Ýþlemininin Sonucu : " + (x + y));
			break;
		}
		case 2: {
			 System.out.println("Çýkarma Ýþlemininin Sonucu : " + (x - y));
			break;
		}
		case 3: {
			 System.out.println("Bölme Ýþlemininin Sonucu : " + (x / y));
			break;
		}
		case 4: {
			 System.out.println("Çarpma Ýþlemininin Sonucu : " + (x * y));
			break;
		}
		default:
			 System.out.println("Yanlýþ Seçim Yaptýnýz : ");
		}
	}

}
