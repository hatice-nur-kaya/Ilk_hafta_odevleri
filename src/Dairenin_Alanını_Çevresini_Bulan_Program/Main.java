package Dairenin_Alanýný_Çevresini_Bulan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner info =new Scanner(System.in);
		System.out.print("Yarýçap Giriniz : ");
		double pi=3.34;
		int r;
		r=info.nextInt();
		double alan = (r*r*pi);
		double cevre =(2*pi*r);
		System.out.println("Dairenin Alaný : "+ alan);
		System.out.print("Dairenin Çevresi : "+ cevre);

	}

}
