package TaksimetreProgramý;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner info =new Scanner(System.in);
		int km;
		System.out.println("Kilometre Giriniz :");
		double taksimetre=2.20,total,startPrice=10;
		km=info.nextInt();
		total =(km*taksimetre);
		total=startPrice;
		total=(total<20)?20:total;
		System.out.print("Toplam Tutar : "+total);
		}
}
