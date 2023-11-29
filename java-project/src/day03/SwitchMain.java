/*package day03_control.quiz;

import java.util.Scanner;

public class ex01_switchMain {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요(s,d,b,j) = ");
		
		char ch = new Scanner(System.in).next().charAt(0); // 배열은 0부터니깐 ex) kbs charAt(2) = s 출력
		// "s" "j" <=== s/0, j/0 뒤에 null 이 붙어있는 것
		
		switch (ch) { // 조건 - 문자형, 정수형 * 정수형(long형) 실수형 안됨
			case 's':
				System.out.println("서울");
				break;
			case 'd':
				System.out.println("대전");
				break;
			case 'b':
				System.out.println("대구");
				break;
			case 'j':
				System.out.println("제주");
				break;
	
			default:
				System.out.println("없는 지역입니다. 도시를 선택하세요(s,d,b,j)");
				
				System.exit(0); // 프로그램 강제 종료 그렇기에 하단 을를 멘트 생략 
		} // switch end 
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}
*/

package day03;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요(s,d,b,j) = ");
		
		// char ch = new Scanner(System.in).next().charAt(0); 
		
		switch (ch) { // 조건 - 문자형, 정수형 * 정수형(long형) 실수형 안됨
			case 's':
				System.out.println("서울");
				break;
			case 'd':
				System.out.println("대전");
				break;
			case 'b':
				System.out.println("대구");
				break;
			case 'j':
				System.out.println("제주");
				break;
	
			default:
				System.out.println("없는 지역입니다. 도시를 선택하세요(s,d,b,j)");
				
				System.exit(0); // 프로그램 강제 종료 그렇기에 하단 을를 멘트 생략 
		} // switch end 
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}










