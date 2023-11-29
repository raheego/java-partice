/*
package day03_control.quiz;

public class ex01_exception {
	public static void main(String[] args) {
		int x = 30, y = 0; 
		int result = 0; 
		
		if( y == 0 ) {
			System.out.println("0 으로 나눌 수 없습니다.");
			
			return; 
		} else {
			result = x / y;
		}
		
		System.out.println(result);
	}
}
/
package day03_control.quiz;

import java.util.Scanner;

public class ex01_exception {
	public static void main(String[] args) {
		System.out.printf("x, y =");
		int x, y, result = 0;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y; // 문제 발생 소지가 있는 코드
			
		} catch (Exception e) {
			// error 보여지는 것들
			// System.out.println("0 으로 나눌 수 없습니다."); // 사용자 메세지
			// System.out.println(e.getMessage());
			// e.printStackTrace(); // 단계적으로 찾아서 출력해줘
		}
	}
}*/

package day03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex01_exception {
	public static void main(String[] args) {
		// Exception Try Muti Catch
		Scanner sc = new Scanner(System.in);
		
		// 상위가 밑으로 
		try {
			System.out.println("정수 두 개 입력해주세요");
			System.out.println("interger 1 > "); int num1 = sc.nextInt();
			System.out.println("interger 2 > "); int num2 = sc.nextInt();
			System.out.println("num1/num2 = " + (num1/num2));
			
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			System.out.println("올바른 숫자를 입력하세요.");
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}



















