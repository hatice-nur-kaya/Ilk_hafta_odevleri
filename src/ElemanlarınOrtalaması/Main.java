package ElemanlarýnOrtalamasý;

public class Main {

	public static void main(String[] args) {

		 int[] numbers = {1, 2, 3, 4, 5};
		  int i, n;
		  double ortalama=0;
	        for (i = 0; i < numbers.length; i++) {
	        	ortalama = ortalama + (1.0 / numbers[i]);
	        }
	        ortalama = numbers.length / ortalama;
	        System.out.println("Harmonik Ortalama : " + ortalama);
	    }
	}


