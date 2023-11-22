/*
package day03_control.quiz;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요(s,d,b,j) = ");
		
		String ch = new Scanner(System.in).next(); 
		
		switch (ch) { 
			case "s":
				System.out.println("서울");
				//break;
			case "d":
				System.out.println("대전");
				//break;
			case "b":
				System.out.println("대구");
				//break;
			case "j":
				System.out.println("제주");
				//break;
	
		} // switch end 
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}
//*/

package day03_control.quiz;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("point = ");
		
		int point = new Scanner(System.in).nextInt(); 
		
		switch (point) { 
			case 1:
				System.out.println("집");
				//break;
			case 2:
				System.out.println("피아노");
				//break;
			case 3:
				System.out.println("햄버거");
				//break;
	
		} // switch end 
		
		System.out.println("축하합니다. 당첨되셨습니다.");
	}
}