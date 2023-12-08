package day04.Input;

import java.util.Scanner;

public class StringNext {
	public static void main(String[] args) {
		/*
		System.out.println("정수 데이터 입력해주세요: ");
		Scanner sc = new Scanner(System.in); //객체 생성, 메모리에 할당. 생성자함수 자동 호출
		
		System.out.println("integer, double, char data input :");
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		char ch = sc.next().charAt(0);
		
		System.out.println(x+ "," + y + ","+ ch);
		
		*/
		
		
		// .next() .nextLine() 비교
		Scanner sc = new Scanner(System.in);
		System.out.println("name str input : ");
		
		String name1 = sc.next(); // .next() 는 공백(토큰) 인식 못함
		String name2 = sc.nextLine(); // .nextLine() 는 공백(토큰) 인식
		
		System.out.println(name1);
		System.out.println(name2);
		
		
		/*
		 	입력 받을때
		 	문자-숫자 순으로 
		 	숫자-문자 순으로 입력 받으면 문제 생김 
		  	ex) sysout( int + number)
		 */
		
		
		
	}
}
