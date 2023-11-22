package ex01.oprator;
/*
 문제 월급 단위로 계산하기
 pay = 567890;
 result:
 만원 : 56장
 천원 : 7장
 백원 : 8개
 십원 : 9개

*/
/*
package ex01.oprator;

public class Quiz01 {
	public static void main(String[] args) {
	int	pay = 567890;
		int tentho = pay / 10000;
		int tho = (pay % 10000) / 1000;
		int hun = (pay % 1000) / 100;
		int ten = (pay % 100) / 10;
		
		System.out.println("월급을 단위로 계산하기");
		System.out.println("만원 : " + tentho + "장");
		System.out.println("천원 : " + tho + "장");
		System.out.println("백원 : " + hun + "장");
		System.out.println("십원 : " + ten + "장");
	}
}
*/


/* 
	int su = 12345;
	시 : 분 : 초
	 60초 => 1분
	60분
	 60초==> 3600
*/
public class OperatorTest1 {
	public static void main(String[] args) {
		int su = 12345;
		int hour = su/3600;
	
	
		System.out.println(hour);
	}
}



