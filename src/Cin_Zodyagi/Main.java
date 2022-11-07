package Cin_Zodyagi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	     	int year;
	        Scanner info = new Scanner(System.in);
	        System.out.println("Hangi Yýlda Doðdunuz: ");
	        year = info.nextInt();
	        int sonuc= (year%12);
	        if(sonuc==0) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Maymun");
	        }
	        else if(sonuc==1) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Horoz");
	        }
	        else if(sonuc==2) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Köpek");
	        }
	        else if(sonuc==3) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Domuz");
	        }
	        else if(sonuc==4) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Fare");
	        }
	        else if(sonuc==5) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Öküz");
	        }
	        else if(sonuc==6) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Kaplan");
	        }
	        else if(sonuc==7) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Tavþan");
	        }
	        else if(sonuc==8) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Ejderha");
	        }
	        else if(sonuc==9) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz Yýlan");
	        }
	        if(sonuc==10) {
		        System.out.println(sonuc+"Çin Zodyaðý Burcunuz At");
	        }
	        if(sonuc==11) {
		        System.out.println("Çin Zodyaðý Burcunuz Koyun");
	        }
        

	}

}
