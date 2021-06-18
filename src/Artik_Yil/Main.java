package Artik_Yil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year;
		int value =4;
		Scanner inp = new Scanner(System.in);
		System.out.print("Doðum Yýlýnýzý  Giriniz :");
		year = inp.nextInt();
		
		if(year % value ==0) {
			System.out.println(year+" "+"Artýk Yýldýr.");
		}else {
			System.out.println(year+" "+"Artýk Yýl Deðildir. ");
			
		}

	}

}
