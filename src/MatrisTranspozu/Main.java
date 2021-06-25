package MatrisTranspozu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int m, n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Matrisin satýr sayýný girin : ");
        m = sc.nextInt();
        System.out.print("Matrisin sütun sayýsýný girin : ");
        n = sc.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Matrisin elemanlarýný girin");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matirisin " + (i + 1) + ". satýr " + (j + 1) + ". sütun elemanýný girin: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matris: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.print("\n");
        }

        int transpose[][] = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrisin tersi:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + "\t");
            }

            System.out.print("\n");
        }
    }
}