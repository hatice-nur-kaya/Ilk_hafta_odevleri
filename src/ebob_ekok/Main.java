package ebob_ekok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  int n1 , n2, ekok,ebob=0;
		  Scanner info =  new Scanner(System.in);
          System.out.printf("Birinci Sayýyý Giriniz : ");
          n1=info.nextInt();
          System.out.printf("Ýkinci Sayýyý Giriniz : ");
          n2=info.nextInt();
	      	     
          for(int i = 1; i < n1; i++)
          {
              if(n1 % i == 0 && n2 % i == 0) {
                  ebob = i;
              }
          }
          System.out.println("Ebob = " + ebob);
          ekok = (n1*n2) / ebob;
          System.out.println("Ekok = " + ekok);


	}

}
