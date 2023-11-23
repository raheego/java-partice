package day03_control.quiz;

public class HomeWork {
	
	public static void main(String[] args) {
/*

*
**
***
****
*****

*/		
	// * 별찍기
			for(int i=1; i<=6; i++) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				} // inner end 
				System.out.println();
			} 
			
			
			System.out.println("=====================");
			
/*
*****
****
***
**
*
*/		
		
			for(int i=1; i<=6; i++) { // i 는 줄의 갯수
				for(int j=6; j>i; j--) {
					System.out.print("*");
			}
			System.out.println();
		}
			
			
			System.out.println("=====================");
		//
			for(int i=1; i<=5; i++) {
				//공백 출력
				for( int j=0; j<5-i; j++ ) {
					System.out.print("");
				}
				// 별찍기
				for( int j=0; j<i; j++ ){
					System.out.print("*");
				}
				//개행
				System.out.println();
			}
			
			System.out.println("=====================");
			
			for(int i=1; i<=5; i++) {
				for(int j=1; j<i; j++) { // i=1일때 j<i (1<1) 성립하지 않기에 공백출력되지 않고 다음 for문으로
					System.out.print(" ");
				}
				for(int j=1; j<6-i; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			
	}
}
