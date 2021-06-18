package ilk_Hafta_odevleri.Not_hesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner not = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Matematik Notu ;");
        matematik = not.nextInt();
        System.out.println("Fizik Notu ;");
        fizik = not.nextInt();
        System.out.println("Kimya Notu ;");
        kimya = not.nextInt();
        System.out.println("Türkçe Notu ;");
        turkce = not.nextInt();
        System.out.println("Tarih Notu ;");
        tarih = not.nextInt();
        System.out.println("Müzik Notu ;");
        muzik = not.nextInt();
        int ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanýz : "+ortalama);
        String sonuc = (ortalama>=60) ? "Geçtinizz" : "Üzgünüm Kaldýnýz";
        System.out.println("Sonuç : "+sonuc);
		
	}

}
