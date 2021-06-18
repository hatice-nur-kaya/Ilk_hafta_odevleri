package KDVTutarýHesaplayanProgram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 double para;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Tutar Giriniz : ");
	        para = input.nextInt();
	        if(para<1000&&para>0){
	            System.out.println("KDV'siz Fiyat : " + para);
	            double tutar1 = para * 0.18 + para;
	            System.out.println("KDV'li Fiyat : " + tutar1);
	            double kdv = para * 0.18;
	            System.out.println("KDV tutarý : " + kdv);
	        }
	        if(para>1000){
	            System.out.println("KDV'siz Fiyat : " + para);
	            double tutar1 = para * 0.08 + para;
	            System.out.println("KDV'li Fiyat : " + tutar1);
	            double kdv = para * 0.08;
	            System.out.println("KDV tutarý : " + kdv);

	        }
	    }
	}