package KuvvetBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		int sayi;
		System.out.println("Bir Sayý Giriniz :");
		sayi=info.nextInt();
		for(int i =1;i<sayi;i++) {
			if(i %4==0 && i %5==0) {
				System.out.println(i);
			}
		}
	}

}
