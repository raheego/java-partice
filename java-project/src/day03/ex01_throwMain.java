package day03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex01_throwMain {
	public static void main(String[] args) {
		System.out.printf("x, y =");
		int x, y, result = 0;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y; // 문제 발생 소지가 있는 코드
			System.out.println(reuslt);
			
		} catch (ArithmeticException e) {	
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("무조건 출력됨 finally");
			//정상&비정상 종료되도 finally 무조건 출력 
		}
	}
}



















