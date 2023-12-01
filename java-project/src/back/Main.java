package back;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];

		// arr1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		// arr2
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		// arr1+arr2
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
			}
			System.out.println();
		}

	}
}