package Ucak_Bileti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		int km,yas,yolcuTipi;
		double normalFiyat,yasIndirimi,tipIndirimi;
		System.out.println("Mesafeyi Griniz : ");
		km=info.nextInt();
		System.out.println("Yaþýnýzý Griniz : ");
		yas=info.nextInt();
		System.out.println("Yolculuk Tipini  Griniz : ");
		yolcuTipi=info.nextInt();
		if(km>0 &&yas>0 && (yolcuTipi==1|| yolcuTipi==2)) {
			normalFiyat=km*0.10;
			if(yas<12) {
				yasIndirimi =normalFiyat*0.5;
			}
			else if (yas>=10 &&yas<=24) {
				yasIndirimi=normalFiyat*0.10;
			}
			else if (yas> 65) {
				yasIndirimi=normalFiyat*0.30;
			}
			else {
				yasIndirimi =0;
			}
			normalFiyat -=yasIndirimi;
			if(yolcuTipi==2) {
				tipIndirimi =normalFiyat*0.20;
				normalFiyat =(normalFiyat- tipIndirimi);
			}
			System.out.println("Bilet Tutarý : "+normalFiyat +"TL");
		}
		else {
			System.out.println("Girdiðiniz Deðerler Eksik veya Yanlýþ!");

		}
      }
	 
	}



