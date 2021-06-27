package DeseneGoreMethot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner info = new Scanner(System.in);
	        System.out.print("Sayı Giriniz: ");
	        int sayi = info.nextInt();
	        int tmp = sayi;
	        metotDeseni(sayi,tmp,false);

	}
	
	   public static void metotDeseni(int sayi, int tmp, boolean status) {

	        if (sayi <= tmp) {
	            System.out.print(sayi +" ");
	            if (sayi > 0 && !status) {
	                metotDeseni(sayi-5,tmp,false);
	            }else{
	                metotDeseni(sayi+5,tmp,true);
	            }
	        }
	    }
	}


