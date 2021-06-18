package Ucak_Bileti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info = new Scanner(System.in);
		int yas,yolculuTipi;
		System.out.println("Mesafe Giriniz : ");
		double km=info.nextDouble() ;
		double ucret = km * 0.10;
		System.out.println("Normal Tutar : "+ucret);
	}

}
