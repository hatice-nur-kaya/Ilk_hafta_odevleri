package MukemmelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = info.nextInt();
        for(int i = 1; i < sayi; i++)  //Mukemmel sayının kuralına göre döngü oluşturularak kontrol sağlanmıştır
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
	}

}
