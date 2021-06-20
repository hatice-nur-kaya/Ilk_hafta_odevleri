package Armstrong;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int sayi ,rakam,toplam=0;
		Scanner info =new Scanner (System.in);
		System.out.println("Bir Sayi Giriniz : ");
		sayi =info.nextInt();
		while(sayi > 0) {
			rakam = sayi % 10;
			toplam = toplam + rakam;
			sayi = sayi / 10;
		}
		System.out.println("Sayidaki rakamlarin toplami : "+ toplam);
	}

}
