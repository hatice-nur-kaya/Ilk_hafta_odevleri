package atm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    String userName, password;
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int quantity;

        while (right > 0) {

            System.out.println("Kullanýcý adý: ");
            userName = sc.next();
            System.out.println("Þifre: ");
            password = sc.next();
            if (userName.equals("HNK") && password.equals("1234")) {
                do {
                    System.out.println("Hoþgeldiniz sayýn " + userName);
                    System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz ");
                    System.out.println("1- Para Yatýrma \n 2- Para Çekme \n 3- Bakiye sorgulama\n 4- Çýkýþ yap");
                    select = sc.nextInt();
                    switch (select ) {
                        case 1:
                        System.out.println("Yatýrýlacak para miktarý: ");
                        quantity = sc.nextInt();
                        System.out.println("Yeni bakiyeniz: " + (balance + quantity));
                        break;
                        case 2:
                        System.out.println("Çekilecek para miktarý: ");
                        quantity = sc.nextInt();
                        if (quantity>balance) {
                            System.out.println("Yetersiz bakiye. Mevcut bakiyeniz: " + balance);
                        }
                        else {System.out.println("Kalan bakiyeniz: " + (balance - quantity));}
                        break;
                        case 3:
                         System.out.println("Mevut bakiyeniz: " + balance);
                    break;
                    }

                } while (select != 4);

                break;
            } else {
                right--;

                System.out.println("Hatalý kullanýcý adý veya þifre.");
                if (right == 0) {
                    System.out.println("Hesabýnýz bloke olmuþtur. Lütfen banka ile iletiþime geçiniz.");
                }
                System.out.println("Kalann hakkýnýz: " + right);
            }
        }
    }
}