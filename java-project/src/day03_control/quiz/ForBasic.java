package day03_control.quiz;

public class ForBasic {
	public static void main(String[] args) {
		for(int i=1; i <= 5; i++ ) {
			System.out.print("*");
		}
		
		for(int i=1; i<=100; i++ ) {
			System.out.print(i + "\t");
			
			if ( i % 10 == 0 ) {
				System.out.println();
			}
		}
	}
}
