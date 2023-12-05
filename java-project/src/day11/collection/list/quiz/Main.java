package day11.collection.list.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
//		Customers c = new Customers("judy","유엔빌리지","0101111");
//		System.out.println(c);
//	
//		Customers c2 = new Customers("judy2","잠실롯데빌리지","11220222");
//		System.out.println(c2);
		
		//Customers[] c = new Customers[5]; 고정길이 배열
		
		// 가변길이 배열을 써보자
		ArrayList<Customers> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		System.out.println("선택하세요 : 1.add , 2.delete, 3.list print");
		
		switch(answer) {
			case 1:
				addCustomer();
				break;
			default: 
				break;
		}
	}
}
/*
 	문제 customers class
 	name address tel field
 	생성자 함수 
 	setter getter
 	
 	+
 	고객추가 삭제 리스트출력 수정 프로그램 종료
 */