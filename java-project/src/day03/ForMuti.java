package day03;

public class ForMuti {
	public static void main(String[] args) {
		
		// basic
//		for(int i = 1; i<=2; i++) {
//			for(int j=1; j<=4; j++) {
//				System.out.println(j+"\t");
//			}
//		}
		
		// 5행 5열 * 출력
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
