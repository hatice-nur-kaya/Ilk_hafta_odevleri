package DeseneGoreMethot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner info = new Scanner(System.in);
	        System.out.print("Sayı Giriniz: ");
	        int number = info.nextInt();
	        int tmp = number;
	        metotDeseni(number,tmp,false);

	}
	
	   public static void metotDeseni(int number, int tmp, boolean status) {

	        if (number <= tmp) {
	            System.out.print(number +" ");
	            if (number > 0 && !status) {
	                metotDeseni(number-5,tmp,false);
	            }else{
	                metotDeseni(number+5,tmp,true);
	            }
	        }
	    }
	}


