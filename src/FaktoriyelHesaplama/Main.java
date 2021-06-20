package FaktoriyelHesaplama;

import java.util.Scanner;

public class Main extends hesaplama {

	public static void main(String[] args) {

		Scanner info =new Scanner (System.in);
		System.out.println("C(n,r) ve P(n,r) bulmak için sýrasýyla n ve r gibi 2 sayý girin: ");
		Scanner scanner1 = new Scanner(System.in);
		int n1 = info.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		int n2 = info.nextInt();

		System.out.println("Kombinasyon :  "+ combination(n1,n2));
		
	}

}
