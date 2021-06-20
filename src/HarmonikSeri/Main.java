package HarmonikSeri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		System.out.println(" N Sayýsý Giriniz : ");
		int n =info.nextInt();
		double result=0.0;
		for(double i =1;i<=n;i++) {
			result += (1/i);
		}
		System.out.println(result);
	}

}
