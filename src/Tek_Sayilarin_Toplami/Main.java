package Tek_Sayilarin_Toplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi = 0  ;
		int toplam = 0;
		Scanner info = new Scanner(System.in);

		do {
			System.out.println("Sayi Giriniz : ");
			sayi=info.nextInt();
			if(sayi%2==0 && sayi%4==0) {
				toplam +=sayi;
			}
			
		}while(sayi%2==0);
		System.out.println("Sayýlarýn Toplamý : "+toplam);
	}

}
