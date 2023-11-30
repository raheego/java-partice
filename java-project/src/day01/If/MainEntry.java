package day01.If;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("integer data: ");
		int su = new Scanner(System.in).nextInt();
		
		/////////////////////
		if( su % 2 == 0 ) System.out.println("even");
		else System.out.println("odd");

		///////////////////////
		if ( su % 2 == 0 ) {
			System.out.println("even");
			System.out.println(1);
			System.out.println(2);
		} else {
			System.out.println("odd");
			System.out.println(3);
			System.out.println(4);
		}
		
		////////////////////////
		//음수양수0 구분하기
		if ( su > 0 ) {
			System.out.println("양수");
		} else if (su == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
	}
}
