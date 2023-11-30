package day05.array02;

public class MainEntry {
	public static void main(String[] args) {
	// 초기화 방법
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] { {1,2,3}, {4,5,6} };
//		int[][] a = { {1,2,3}, {4,5,6} };
//		
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++ ) {
//				System.out.print( a[i][j] );
//			}
//			System.out.println();
//		}
		
		int[][] a = { {1,2,3}, {4,55,6} };
		
		System.out.println("행의 길이 : " + a.length);
		System.out.println("열의 길이 : " + a[0].length);
		System.out.println("열의 길이 : " + a[1].length);
		
		for (int i = 0; i < a.length; i++) { // row - 개행
			for (int j = 0; j < a[i].length; j++ ) { // col - 출력
				System.out.print( a[i][j] + "\t" );
			}
			System.out.println();
		}
		
		
	}
}
