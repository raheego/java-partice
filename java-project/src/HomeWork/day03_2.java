/*
	사칙연산 프로그램 작성
	4
	5
	+
	
	4+5 = 9
*/
package day03_control.quiz;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1을 입력하세요");
		int num1 = sc.nextInt();
		
		System.out.println("숫자2를 입력하세요");
		int num2 = sc.nextInt();
		
		System.out.println("+ - * % / 기호를 넣어주세요.");
		int sum = 0; 
		String calc = sc.next();
	
		switch (calc) {
			case "+":
				sum = (num1 + num2); break;
			case "-":
				sum = (num1 - num2); break;
			case "*":
				sum = (num1 * num2); break;
			case "/":
				sum = (num1 / num2); break;
			case "%":
				sum = (num1 % num2); break;
			default:
				System.out.println("+ - * % / 기호를 넣어주세요.");
				break;
		} // switch end 
		
		/*
		char op = sc.next().charAt(0);
		if(op == '+') sum = x+y;
		else if ( op == '-') sum = x-y;
		else if ( op == '*') sum = x*y;
		else if ( op == '/') sum = x/y;
		*/
		
		
		System.out.printf("%d %s %d = %d",num1,calc,num2,sum);
	} // main end 
}
