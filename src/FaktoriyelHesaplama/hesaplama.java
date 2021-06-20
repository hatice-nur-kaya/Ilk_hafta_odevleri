package FaktoriyelHesaplama;

public class hesaplama {

	public static int factorial(int number) {
		int result=1;
		for(int i=1;i<=number;i++) {
			result= result *i;
		}
		return result;
	}
	public static int combination(int n, int r) {
		if(n>0 && r>0 && n >= r) {
		return (factorial(n)/(factorial(n-r)*factorial(r)));
		}
		else return 0;
	}
}
