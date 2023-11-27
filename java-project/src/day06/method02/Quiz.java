package day06.method02;

import java.util.Scanner;

public class Quiz {
	// 사칙연산 함수(+-*/) 2개 리턴타입o 매개변수o / 2개 리턴타입x
	// plus(+), sub, mul, div(/) <-- 예외처리
	
	// 매개변수o 리턴타입o
	public static int plus(int x, int y) {
		int calc = x + y; 
		return calc; 
	}
	
	public static int sub(int x, int y) {
		return x - y;
		// if문으로 큰 수에서 빼는 조건을 걸어도 됨
	}
	
	// 리턴타입x 
//	public static void mul() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("곱셈) x,y 입력하세요");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int result = (x*y);
//		System.out.println("곱하기 : " + result);
//	}
	
	public static void mul(int x, int y) {
		int result = (x*y);
		System.out.println("곱하기 : " + result);
	}
	
	public static void div(int x, int y) {
		try {
			int result = (x/y);
			System.out.println("나누기 : " + result);
		} catch (Exception e) {
			// error 보여지는 것들
			 System.out.println("0 으로 나눌 수 없습니다.");
		}
		
		// 2. 예외처리
//		if( y == 0 ) {
//			System.out.println("0 으로 나눌 수 없습니다.");
//			return;
//		}
	}
	
	
	//Main
	public static void main(String[] args) {
//		int add = plus(2,4);
//		System.out.println("더하기 : " + add);
//		
//		int result = sub(4,3);
//		System.out.println("빼기 : " + result);
//		
//		mul();
//		
//		div(4,2);
	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("integer data input 1 2 3 0");
			int choice = sc.nextInt();
			int result = 0;
			
			switch(choice) {
				case 1: 
					System.out.println("더하기");
					// 리턴타입이니까
					result = plus( sc.nextInt(),sc.nextInt() ); 
					break;
				case 2:
					System.out.println("빼기");
					sub( sc.nextInt(),sc.nextInt() ); 
					break;
				case 3: 
					System.out.println("나눗셈");
					div( sc.nextInt(),sc.nextInt() ); 
					break;
				case 4: 
					System.out.println("곱하기");
					mul( sc.nextInt(),sc.nextInt() ); 
					break; 
				case 0:
					System.out.println("프로그램 종료");
					System.exit(0);
				default :
					System.out.println("숫자만 입력해주세요.");
					break;
			} //switch end
			
			System.out.println("프로그램 강제 종료됨");
		} // while end
	}
	
}
