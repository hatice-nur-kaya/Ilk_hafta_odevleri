package TamBolunebilme;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		int sayi;
		double ortalama=0.0;
		int toplam =0;
		int sayac =0;

		System.out.println("Sayý Deðeri Giriniz : ");
		sayi=info.nextInt();
		 for(int i =0; i<sayi;i++) {
			 if (i % 3 == 0 && i%4==0)
             {
				 sayac++;
				 toplam +=i;
				 ortalama=toplam /sayac;
							 }
		 }
		 System.out.print("Ortalama : "+ ortalama );
	}

}
