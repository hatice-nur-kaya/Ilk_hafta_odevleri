package Hava_Sicakligine_Gore_Etkinlik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner info =new Scanner(System.in);
		double sicaklik;
		System.out.print("Sýcaklýðý Giriniz :");
        sicaklik= info.nextDouble();
        if(sicaklik <5) {
    		System.out.println("Bu havada kayak yapabilirsiniz.");
        }
        if(sicaklik >= 5 || sicaklik >=15) {
    		System.out.println("Bu havada sinemaya gidebilirsinz");
        }
        if(sicaklik >= 10 || sicaklik >=25) {
    		System.out.println("Bu havada piknik yapabilirsiniz.");
        }
        if(sicaklik >25) {
    		System.out.println("Bu havada Yüzmeye gidebilirsinz");
        }
	}

}
