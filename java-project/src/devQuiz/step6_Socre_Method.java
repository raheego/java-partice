package devQuiz;

import java.util.Scanner;

public class step6_Socre_Method {
	/*
	 * 입력함수 input() 이름 국어 영어 전산 점수
	 * 총점함수 total() 총점 구하는 함수
	 * 평균함수 average() 평균 구하는 함수
	 * 평점(학점) grade() 학점 구하는 함수
	 * 출력함수 output() 결과 출력하는 함수
	 * main 함수
	 * 
	 * */
	
	//input
	public static void input() {
		Scanner sc = new Scanner(System.in); 
		int kor, eng, com, tot = 0;
		double avg= 0;
		
		System.out.print("name = ");
		String name = sc.nextLine();

		 do {
				System.out.print("국어 점수를 입력하세요(0~100) = ");
				kor = sc.nextInt();	
		  } while ( kor < 0 || kor > 100 );
		 do {
				System.out.print("영어 점수를 입력하세요(0~100) = ");
				eng = sc.nextInt();	
		  } while ( eng < 0 || eng > 100 );
		 do {
				System.out.print("전산 점수를 입력하세요(0~100) = ");
				com = sc.nextInt();	
		  } while ( com < 0 || com > 100 );
	}
	
	
	//total
	public static int total(int...n) { 
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		return sum;
	}
	
	//average
	public static double average(int...a) {
		double avg = total(a) / a.length;
		return avg;
	}
	
	//grade
	public static void grade() {
		char grade = ' ';
		switch ( (int) avg / 10 ) {	
			case 10:
			case 9: grade = 'A';	break;
			case 8: grade = 'B';	break;
			case 7: grade = 'C';	break;
			case 6: grade = 'D';	break;
			default: grade= 'F';		
		} 
	} 
	
	//output
	public static void output() { 
		System.out.println("\n\n****  " + name +"님의 성적표 **********");
		System.out.println("국어 : " + input.kor + " 영어 : " + input.eng + " 전산 : " + input.com);
		System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c ", tot, avg, grade );
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	
		input();
	}
}
