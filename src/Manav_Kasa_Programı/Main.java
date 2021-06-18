package Manav_Kasa_Programý;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		double armut,elma,domates,muz,patlýcan;
		System.out.print("Armut Miktarýný Giriniz :");
        armut= info.nextDouble();
        System.out.print("Elma Miktarýný Giriniz :");
        elma= info.nextDouble();
        System.out.print("Domates Miktarýný Giriniz :");
        domates= info.nextDouble();
        System.out.print("Muz Miktarýný Giriniz :");
        muz= info.nextDouble();
        System.out.print("Patlýcan Miktarýný Giriniz :");
        patlýcan= info.nextDouble();
        double tutar=(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlýcan*5.00);
        System.out.print("Toplam Tutar : "+tutar+ "TL");
	}

}
