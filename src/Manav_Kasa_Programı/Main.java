package Manav_Kasa_Programı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
	Scanner info =new Scanner(System.in);  // Kullanıcıdan bilgi alır
	double pear,apple,tomatoes,banana,aubergine;
        System.out.print("Armut Miktarını Giriniz :");
        pear= info.nextDouble();
        System.out.print("Elma Miktarını Giriniz :");
        apple= info.nextDouble();
        System.out.print("Domates Miktarını Giriniz :");
        tomatoes= info.nextDouble();
        System.out.print("Muz Miktarını Giriniz :");
        banana= info.nextDouble();
        System.out.print("Patlıcan Miktarını Giriniz :");
        aubergine= info.nextDouble();
        double tutar=(pear*2.14+apple*3.67+domates*1.11+banana*0.95+aubergine*5.00); //Kasadaki işlemler
        System.out.print("Toplam Tutar : "+tutar+ "TL"); 
	}

}
