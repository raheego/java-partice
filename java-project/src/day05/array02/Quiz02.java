package day05.array02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//3행 4열 행 만들기
		// 1,2 같은행 같은열을 더해서 3행의 각자 열에 넣음
		
		// 1.
		int[][] arr2 = new int[][] { { 7, 2, 1, 3 }, { 10, 8, 9, 7 }, { 0,0,0,0 } };
		for(int i=0; i < arr2.length; i ++ ) {
			for(int j=0; j < arr2[i].length; j++ ) {
				System.out.print( arr2[i][j]+"\t" );
				arr2[2][j] += arr2[i][j];
			}
			System.out.println();
		}
		
		// 2. 
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][4];
		
		for(int i=0; i < a.length; i++ ) {
			for(int j=0; j < a[i].length; j++ ) {
				if ( i == 2 ) {
					a[2][j] = a[0][j]+a[1][j];
				} else {
					a[i][j] = sc.nextInt();
				} // if end
			} // inner for end 
		}// outer for end
		System.out.println();

		//output
		for(int i = 0; i< a.length; i ++ ) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
