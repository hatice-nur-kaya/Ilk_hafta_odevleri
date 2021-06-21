package Kullanýcý_Girisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String userName ,password;
		String passwordLogin ="1234";
		Scanner inp =new Scanner(System.in);
		
		System.out.println("Kullanýcý adýnýzý giriniz");
		userName =inp.nextLine();
		
		System.out.println("Þifrenizi giriniz");
		password =inp.nextLine();
		
		if(userName.equals("HaticeNur") && password.equals(passwordLogin)) {
			System.out.println("Baþarýlý");
			
		}else {
		
		
			System.out.println("Kullanýcý adýnýz yada þifreyi yanlýþ girdiniz.Sýfýrlamak ister misin?");
			System.out.println("1 evet , 2 hayýr");
			int select =inp.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("yeni þifrenizi girin:");
				String newPassword = inp.next();
				
				
				if(newPassword.equals(passwordLogin)  || newPassword.endsWith(password)) {
					System.out.println("yeni oluþturduðunuz þifre eski þifreniz ile ayný olamaz ");
				
				}else {
					System.out.println("yeni þifre oluþturuldu");
					password=newPassword; 
				}
				 break;
			case 2:
				System.out.println("Þifre sýfýrlama iptal edildi.");
			
			break;
	}

		}}}
