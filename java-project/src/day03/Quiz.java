package day03;

import java.util.Scanner;
/*
public class Quiz {
	public static void main(String[] args) {
		int num1, num2;
		System.out.print("숫자 2개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if ( num1 > num2 ) {
			System.out.println(num1 + "이 더 큽니다.");
		} else if ( num1 < num2 ) {
			System.out.println(num2 + "이 더 큽니다.");
		} else {
			System.out.println("두 수는 같습니다.");
		}
	}
}
*/

/*
	연도 입력 받아서 윤/평년 판정 프로그램 작성
	윤년/평년 판정 프로그램 작성
	if ( 년도 % 4 == 0 )
	if ( (년도 % 100 != 0 ) || ( 년도 % 400 == 0 ) )
	"윤년"
*/

/*
 * 4로 나눠 떨어지면 윤년
 * 100으로 나누었을 때 평년
 * 
 * 4,100,400 / = 윤년
 * */
public class Quiz {
	public static void main(String[] args) {
		int year = 2008;

		if ( year % 4 == 0 ) {
			if ( (year % 100 != 0 ) || (year % 400 == 0) ) {
				System.out.println("윤년");
			} else {
				System.out.println("평년");
			}
		} else {
			System.out.println("평년");
		}
	}
}

	
/*
	전산, 영어, 국어 점수를 입력받아 평균 60점 이상이고, 
	각 과목 과락 40점 이하이면 과목 불합격 처리 

*/

public class Quiz {
	public static void main(String[] args) {
	
	}
}


