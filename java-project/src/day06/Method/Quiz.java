package day06.Method;

import java.util.Scanner;

public class Quiz {
	
	
	// info() { 이름, 연락처, 주소 };
	// abs(int x) { 절대값 구하는 함수 }
	// max(){ 정수 2개 입력 받아서 큰수 출력 함수 }
	public static void info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 연락처 주소를 입력해주세요");
		String name = sc.next();
		String phone = sc.next();
		String addr = sc.next();
		System.out.println("이름 : " + name + " 연락처 : "+ phone + " 주소 : " + addr);
	}
	public static void abs(int x) {
		if ( x < 0 ) x = -x;
		else x = x;
		System.out.println("절대값 : " + x);
	}
	public static void max(int x, int y) {
		int result = (x > y) ? x : y;
		System.out.println(x+"와"+y+"중 큰 수는 "+ result);
	}
	public static void max() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x , y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result = (x > y) ? x : y;
		System.out.println(x+"와"+y+"중 큰 수는 "+ result);
	}
	public static void main(String[] args) {
		info();
		abs(-4);
		max(5,8);
		max();
	}
	
	
}
