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
	}
}
