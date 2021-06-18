package Dairenin_Alanýný_Çevresini_Bulan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner info =new Scanner(System.in);
		double pi=3.34;
		double r, a;
		System.out.println("Yarýçap Giriniz : ");
		r=info.nextInt();
		System.out.print("Merkez Açýsýsýnýn Ölçüsünü Giriniz : ");
		a =info.nextDouble();
		double alan = (pi * (r*r)* a) / 360;
		System.out.println("Dairenin Alaný : "+ alan);
	

	}

}
