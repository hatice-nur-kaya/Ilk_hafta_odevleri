package AsalSayiBulma;

public class Main {

	public static void main(String[] args) {
		 int sayi;
         for(int i=2; i<=100; i++){ //for döngüsü ile sayıları dolaşarak asalları tespit ederiz.
             sayi=0;
             for(int j=2; j<=i/2; j++){
                 if(i%j==0) sayi++;
             }
             if(sayi==0) System.out.println(+i);
         }
     }
 }


